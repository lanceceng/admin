package com.cat.admin.modules.controller;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cat.admin.core.api.BaseController;
import com.cat.admin.core.utils.ApiResult;
import com.cat.admin.core.utils.TreeBuilder;
import com.cat.admin.modules.dto.input.MenuQueryPara;
import com.cat.admin.modules.dto.output.MenuTreeNode;
import com.cat.admin.modules.entity.Menu;
import com.cat.admin.modules.service.IMenuService;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * <p> 系统管理-菜单表  接口 </p>
 *
 * @author: cat
 * @description:
 * @date: 2020-06-06
 *
 */
@RestController
@RequestMapping("/api/system/menu")
@Api(description = "系统管理 - 菜单表 接口")
public class SysMenuController extends BaseController {

    @Autowired
    IMenuService menuService;

    @PostMapping(value = "/treeMenu", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取菜单树", httpMethod = "POST", response = ApiResult.class)
    public ApiResult treeMenu() {
        List<Menu> list = menuService.listTreeMenu();
        List<MenuTreeNode> menuTreeNodeList = Lists.newArrayList();
        if( list != null && !list.isEmpty() ){
            list.forEach( temp->{
                MenuTreeNode menuTreeNode = new MenuTreeNode();
                BeanUtil.copyProperties( temp, menuTreeNode);
                menuTreeNodeList.add( menuTreeNode );
            } );
        }
        List<MenuTreeNode> menuTreeNodeList2 = TreeBuilder.buildMenuTree( menuTreeNodeList );

        menuTreeNodeList2.stream().sorted( Comparator.comparing( MenuTreeNode::getSortNo ) ).collect( Collectors.toList());
        JSONObject json = new JSONObject();
        json.put( "menuList", list);
        json.put( "menuTree", menuTreeNodeList2);
        return ApiResult.ok("获取菜单树成功", json);
    }

    @PostMapping(value = "/save", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "保存菜单 ", httpMethod = "POST", response = ApiResult.class)
    public ApiResult save(@RequestBody @Validated Menu input) {
        Integer id = menuService.saveMenu(input);
        return ApiResult.ok("保存菜单成功", id);
    }

    @PostMapping(value = "/delete", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "删除菜单", httpMethod = "POST", response = ApiResult.class)
    public ApiResult delete(@RequestBody MenuQueryPara input) {
        // 如果该菜单下存在子菜单，提示先删除子菜单
        List<Menu> menuList = menuService.list(new QueryWrapper<Menu>().eq("parent_id", input.getId()));
        if (!CollectionUtils.isEmpty(menuList)){
//            menuList.forEach(e -> menuService.deleteById(e.getId()));
            return ApiResult.fail("该菜单下存在子菜单，请先删除子菜单！");
        }
        menuService.removeById(input.getId());
        return ApiResult.ok("删除菜单成功");
    }

    // 下面暂时不用 ================================================

    @PostMapping(value = "/listPage", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取系统管理-菜单表 列表分页", httpMethod = "POST", response = ApiResult.class)
    public ApiResult listPage(@RequestBody MenuQueryPara filter) {
        Page<Menu> page = new Page<>(filter.getPage(),filter.getLimit());
        menuService.listPage(page, filter);
        return ApiResult.ok("获取系统管理-菜单表 列表分页成功", page);
    }

    @PostMapping(value = "/list", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取系统管理-菜单表 列表", httpMethod = "POST", response = ApiResult.class)
    public ApiResult list(@RequestBody MenuQueryPara filter) {
        List<Menu> result = menuService.list(filter);
        return ApiResult.ok("获取系统管理-菜单表 列表成功",result);
    }

    @PostMapping(value = "/getById", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取系统管理-菜单表 信息", httpMethod = "POST", response = ApiResult.class)
    public ApiResult getById(@RequestBody MenuQueryPara input) {
        Menu entity = menuService.getById(input.getId());
        return ApiResult.ok("获取系统管理-菜单表 信息成功", entity);
    }

}
