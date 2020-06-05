package com.cat.admin.modules.controller;

import com.cat.admin.modules.entity.SysPermit;
import com.cat.admin.modules.service.SysPermitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 权限表(SysPermit)表控制层
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@RestController
@RequestMapping("permit")
public class SysPermitController {
    /**
     * 服务对象
     */
    @Resource
    private SysPermitService sysPermitService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public SysPermit selectOne(Integer id) {
        return this.sysPermitService.queryById(id);
    }

}