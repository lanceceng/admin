package com.cat.admin.modules.controller;

import com.cat.admin.modules.entity.SysRolePermit;
import com.cat.admin.modules.service.SysRolePermitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色权限关系表(SysRolePermit)表控制层
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@RestController
@RequestMapping("role/permit")
public class SysRolePermitController {
    /**
     * 服务对象
     */
    @Resource
    private SysRolePermitService sysRolePermitService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public SysRolePermit selectOne(String id) {
        return this.sysRolePermitService.queryById(id);
    }

}