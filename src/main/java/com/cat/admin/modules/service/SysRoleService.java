package com.cat.admin.modules.service;

import com.cat.admin.modules.entity.SysRole;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 角色表(SysRole)表服务接口
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
public interface SysRoleService extends IService<SysRole> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysRole queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    SysRole insert(SysRole sysRole);

    /**
     * 修改数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    SysRole update(SysRole sysRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}