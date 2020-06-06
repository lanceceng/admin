package com.cat.admin.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cat.admin.modules.dto.input.RoleQueryPara;
import com.cat.admin.modules.entity.Role;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p> 系统管理-角色表  Mapper 接口 </p>
 *
 * @author : cat
 * @date : 2020-06-06
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
    List<Role> selectRoles(Pagination page, @Param("filter") RoleQueryPara filter);

    /**
     * 列表
     *
     * @param filter
     * @return
     */
    List<Role> selectRoles(@Param("filter") RoleQueryPara filter);

    /**
     * 通过用户ID查询角色集合
     *
     * @param userId:
     * @return: java.util.List<Role>
     */
    List<Role> selectRoleByUserId(@Param("userId") Integer userId);

    /**
     * 通过菜单ID查询角色集合
     *
     * @param menuId:
     * @return: java.util.List<Role>
     */
    List<Role> selectRoleByMenuId(@Param("menuId") Integer menuId);

}
