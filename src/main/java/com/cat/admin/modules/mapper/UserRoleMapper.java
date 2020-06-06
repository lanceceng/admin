package com.cat.admin.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cat.admin.modules.dto.input.UserRoleQueryPara;
import com.cat.admin.modules.entity.Role;
import com.cat.admin.modules.entity.UserRole;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p> 系统管理 - 用户角色关联表  Mapper 接口 </p>
 *
 * @author : cat
 * @date : 2020-06-06
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    /**
     * 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
    List<UserRole> selectUserRoles(Pagination page, @Param("filter") UserRoleQueryPara filter);

    /**
     * 列表
     *
     * @param filter
     * @return
     */
    List<UserRole> selectUserRoles(@Param("filter") UserRoleQueryPara filter);

    /**
     * 根据角色Id删除用户与角色相关联数据
     *
     * @param roleId:
     * @return: void
     */
    void deleteByRoleId(@Param("roleId") Integer roleId);

    /**
     * 根据用户Id查询关联角色
     *
     * @param userId:
     * @return: java.util.List<com.cat.modules.system.entity.Role>
     */
    List<Role> selectRoleByUserId(@Param("userId") Integer userId);

}
