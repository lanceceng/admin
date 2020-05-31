package com.cat.admin.modules.controller;

import com.cat.admin.modules.entity.SysRoleMenu;
import com.cat.admin.modules.service.SysRoleMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色菜单关系表(SysRoleMenu)表控制层
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@RestController
@RequestMapping("sysRoleMenu")
public class SysRoleMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public SysRoleMenu selectOne(String id) {
        return this.sysRoleMenuService.queryById(id);
    }

}