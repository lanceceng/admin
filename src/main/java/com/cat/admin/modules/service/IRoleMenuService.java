package com.cat.admin.modules.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cat.admin.modules.dto.input.RoleMenuQueryPara;
import com.cat.admin.modules.entity.RoleMenu;

import java.util.List;

/**
 * <p>  系统管理 - 角色-菜单关联表  服务类 </p>
 *
 * @author: cat
 * @date: 2020-06-06
 */
public interface IRoleMenuService extends IService<RoleMenu> {

    /**
     * 系统管理 - 角色-菜单关联表 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
    void listPage(Page<RoleMenu> page, RoleMenuQueryPara filter);

    /**
     * 保存系统管理 - 角色-菜单关联表
     *
     * @param input
     */
    Integer saveRoleMenu(RoleMenu input);

    /**
     * 系统管理 - 角色-菜单关联表 列表
     *
     * @param filter
     * @return
     */
    List<RoleMenu> list(RoleMenuQueryPara filter);

    /**
     * 保存角色相关联菜单
     *
     * @param filter:
     * @return: void
     */
    void saveRoleMenu(RoleMenuQueryPara filter);
}
