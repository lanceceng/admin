package com.cat.admin.modules.controller;

import com.cat.admin.modules.entity.SysRole;
import com.cat.admin.modules.service.SysRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色表(SysRole)表控制层
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@RestController
@RequestMapping("role")
public class SysRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleService sysRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public SysRole selectOne(Integer id) {
        return this.sysRoleService.queryById(id);
    }

}