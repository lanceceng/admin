package com.cat.admin.modules.dao;

import com.cat.admin.modules.entity.SysRoleMenu;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 角色菜单关系表(SysRoleMenu)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenu>{

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    SysRoleMenu queryById(String roleId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysRoleMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysRoleMenu 实例对象
     * @return 对象列表
     */
    List<SysRoleMenu> queryAll(SysRoleMenu sysRoleMenu);

    /**
     * 新增数据
     *
     * @param sysRoleMenu 实例对象
     * @return 影响行数
     */
    int insert(SysRoleMenu sysRoleMenu);

    /**
     * 修改数据
     *
     * @param sysRoleMenu 实例对象
     * @return 影响行数
     */
    int update(SysRoleMenu sysRoleMenu);

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 影响行数
     */
    int deleteById(String roleId);

}