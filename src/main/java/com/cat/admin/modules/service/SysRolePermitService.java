package com.cat.admin.modules.service;

import com.cat.admin.modules.entity.SysRolePermit;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 角色权限关系表(SysRolePermit)表服务接口
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
public interface SysRolePermitService extends IService<SysRolePermit> {

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    SysRolePermit queryById(String roleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysRolePermit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysRolePermit 实例对象
     * @return 实例对象
     */
    SysRolePermit insert(SysRolePermit sysRolePermit);

    /**
     * 修改数据
     *
     * @param sysRolePermit 实例对象
     * @return 实例对象
     */
    SysRolePermit update(SysRolePermit sysRolePermit);

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 是否成功
     */
    boolean deleteById(String roleId);

}