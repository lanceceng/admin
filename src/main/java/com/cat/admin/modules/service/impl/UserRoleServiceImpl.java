package com.cat.admin.modules.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cat.admin.modules.dto.input.UserRoleQueryPara;
import com.cat.admin.modules.entity.UserRole;
import com.cat.admin.modules.mapper.UserRoleMapper;
import com.cat.admin.modules.service.IUserRoleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p> 系统管理 - 用户角色关联表  服务实现类 </p>
 *
 * @author: cat
 * @date: 2020-06-06
 */
@Service
@Transactional
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

    @Resource
    UserRoleMapper userRoleMapper;

    @Override
    public void listPage(Page<UserRole> page, UserRoleQueryPara filter) {
        page.setRecords(userRoleMapper.selectUserRoles(page, filter));
    }

    @Override
    public List<UserRole> list(UserRoleQueryPara filter) {
        return userRoleMapper.selectUserRoles(filter);
    }

    @Override
    public Integer saveUserRole(UserRole para) {
        if (para.getId()!=null) {
            userRoleMapper.updateById(para);
        } else {
            userRoleMapper.insert(para);
        }
        return para.getId();
    }

    @Override
    public void saveUserRole(UserRoleQueryPara para) {
        Integer roleId = para.getRoleId();
        String userIds = para.getUserIds();
        userRoleMapper.deleteByRoleId( roleId );
        if( StringUtils.isNotBlank( userIds ) ){
            String[] userIdArrays = userIds.split( "," );
            if( userIdArrays.length > 0 ){
                for (String userId : userIdArrays) {
                    UserRole userRole = new UserRole();
                    userRole.setRoleId( roleId );
                    userRole.setUserId( Integer.parseInt( userId ) );
                    userRoleMapper.insert( userRole );
                }
            }
        }
    }

}
