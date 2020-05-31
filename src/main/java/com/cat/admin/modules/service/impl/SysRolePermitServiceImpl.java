package com.cat.admin.modules.service.impl;

import com.cat.admin.modules.entity.SysRolePermit;
import com.cat.admin.modules.dao.SysRolePermitDao;
import com.cat.admin.modules.service.SysRolePermitService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色权限关系表(SysRolePermit)表服务实现类
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@Service("sysRolePermitService")
public class SysRolePermitServiceImpl extends ServiceImpl<SysRolePermitDao, SysRolePermit> implements SysRolePermitService {
    @Resource
    private SysRolePermitDao sysRolePermitDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    @Override
    public SysRolePermit queryById(String roleId) {
        return this.sysRolePermitDao.queryById(roleId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysRolePermit> queryAllByLimit(int offset, int limit) {
        return this.sysRolePermitDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysRolePermit 实例对象
     * @return 实例对象
     */
    @Override
    public SysRolePermit insert(SysRolePermit sysRolePermit) {
        this.sysRolePermitDao.insert(sysRolePermit);
        return sysRolePermit;
    }

    /**
     * 修改数据
     *
     * @param sysRolePermit 实例对象
     * @return 实例对象
     */
    @Override
    public SysRolePermit update(SysRolePermit sysRolePermit) {
        this.sysRolePermitDao.update(sysRolePermit);
        return this.queryById(sysRolePermit.getRoleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String roleId) {
        return this.sysRolePermitDao.deleteById(roleId) > 0;
    }
}