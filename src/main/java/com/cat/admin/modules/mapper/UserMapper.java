package com.cat.admin.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cat.admin.modules.dto.input.UserQueryPara;
import com.cat.admin.modules.entity.User;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p> 系统管理-用户基础信息表 Mapper 接口 </p>
 *
 * @author: cat
 * @date: 2020-06-06
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
    List<User> selectUsers(Pagination page, @Param("filter") UserQueryPara filter);

    /**
     * 列表
     *
     * @param filter
     * @return
     */
    List<User> selectUsers(@Param("filter") UserQueryPara filter);

    /**
     * 通过账号查找用户信息
     *
     * @param username:
     * @return: com.cat.modules.system.entity.User
     */
    User selectUserByUsername(@Param("username") String username);

    /**
     * 通过token查找用户信息
     *
     * @param token:
     * @return: com.cat.modules.system.entity.User
     */
    User getUserInfoByToken(@Param("token") String token);

    /**
     * 通过qq_oppen_id查找用户信息
     *
     * @param qqOppenId:
     * @return: com.cat.modules.system.entity.User
     */
    User getUserInfoByQQ(@Param("qq_oppen_id") String qqOppenId);

    /**
     * 通过角色ID查询用户集合
     *
     * @param roleId:
     * @return: java.util.List<Role>
     */
    List<User> selectUserByRoleId(@Param("roleId") Integer roleId);

}
