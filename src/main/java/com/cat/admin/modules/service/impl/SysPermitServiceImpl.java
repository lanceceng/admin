package com.cat.admin.modules.service.impl;

import com.cat.admin.modules.entity.SysPermit;
import com.cat.admin.modules.dao.SysPermitDao;
import com.cat.admin.modules.service.SysPermitService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限表(SysPermit)表服务实现类
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@Service("sysPermitService")
public class SysPermitServiceImpl extends ServiceImpl<SysPermitDao, SysPermit> implements SysPermitService {
    @Resource
    private SysPermitDao sysPermitDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysPermit queryById(Integer id) {
        return this.sysPermitDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysPermit> queryAllByLimit(int offset, int limit) {
        return this.sysPermitDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysPermit 实例对象
     * @return 实例对象
     */
    @Override
    public SysPermit insert(SysPermit sysPermit) {
        this.sysPermitDao.insert(sysPermit);
        return sysPermit;
    }

    /**
     * 修改数据
     *
     * @param sysPermit 实例对象
     * @return 实例对象
     */
    @Override
    public SysPermit update(SysPermit sysPermit) {
        this.sysPermitDao.update(sysPermit);
        return this.queryById(sysPermit.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysPermitDao.deleteById(id) > 0;
    }
}