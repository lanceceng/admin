package com.cat.admin.modules.service;

import com.cat.admin.modules.entity.SysRoleMenu;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 角色菜单关系表(SysRoleMenu)表服务接口
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
public interface SysRoleMenuService extends IService<SysRoleMenu> {

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    SysRoleMenu queryById(String roleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysRoleMenu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysRoleMenu 实例对象
     * @return 实例对象
     */
    SysRoleMenu insert(SysRoleMenu sysRoleMenu);

    /**
     * 修改数据
     *
     * @param sysRoleMenu 实例对象
     * @return 实例对象
     */
    SysRoleMenu update(SysRoleMenu sysRoleMenu);

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 是否成功
     */
    boolean deleteById(String roleId);

}