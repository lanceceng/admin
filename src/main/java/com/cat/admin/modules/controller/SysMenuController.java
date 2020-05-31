package com.cat.admin.modules.controller;

import com.cat.admin.modules.entity.SysMenu;
import com.cat.admin.modules.service.SysMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 菜单表(SysMenu)表控制层
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@RestController
@RequestMapping("sysMenu")
public class SysMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysMenuService sysMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public SysMenu selectOne(Integer id) {
        return this.sysMenuService.queryById(id);
    }

}