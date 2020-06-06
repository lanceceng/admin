package com.cat.admin.modules.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cat.admin.modules.dto.input.RoleQueryPara;
import com.cat.admin.modules.entity.Role;

import java.util.List;

/**
 * <p>  系统管理-角色表  服务类 </p>
 *
 * @author: cat
 * @date: 2020-06-06
 */
public interface IRoleService extends IService<Role> {

    /**
     * 系统管理-角色表 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
    void listPage(Page<Role> page, RoleQueryPara filter);

    /**
     * 保存系统管理-角色表
     *
     * @param input
     */
    Integer saveRole(Role input);

    /**
     * 系统管理-角色表 列表
     *
     * @param filter
     * @return
     */
    List<Role> list(RoleQueryPara filter);
}
