package com.cat.admin.modules.controller;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cat.admin.core.api.BaseController;
import com.cat.admin.core.utils.ApiResult;
import com.cat.admin.modules.dto.input.UserQueryPara;
import com.cat.admin.modules.dto.model.UserInfoVO;
import com.cat.admin.modules.dto.output.UserTreeNode;
import com.cat.admin.modules.entity.User;
import com.cat.admin.modules.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> 系统管理-用户基础信息表 接口 </p>
 *
 * @author: cat
 * @description:
 * @date: 2020-06-06
 */
@RestController
@RequestMapping("/api/system/user")
@Api(description = "系统管理-用户基础信息表接口")
public class SysUserController extends BaseController {

    @Autowired
    IUserService userService;

    @PostMapping(value = "/getCurrentUserInfo", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取当前登录用户信息", httpMethod = "POST", response = ApiResult.class, notes = "获取当前登录用户信息")
    public ApiResult getCurrentUserInfo(@RequestHeader(name = "X-Token") String token) {
        UserInfoVO info = userService.getCurrentUserInfo(token);
        return ApiResult.ok(200, "获取当前登录用户信息成功", info);
    }

    @PostMapping(value = "/listPage", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取系统管理-用户基础信息表列表分页", httpMethod = "POST", response = ApiResult.class)
    public ApiResult listPage(@RequestBody UserQueryPara filter) {
        Page<User> page = new Page<>(filter.getPage(), filter.getLimit());
        userService.listPage(page, filter);
        return ApiResult.ok("获取系统管理-用户基础信息表列表分页成功", page);
    }

    @PostMapping(value = "/treeUser", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取用户树", httpMethod = "POST", response = ApiResult.class)
    public ApiResult treeUser() {
        List<User> list = userService.list();
        List<UserTreeNode> userTreeNodeList = new ArrayList<>();
        list.forEach(temp -> {
            UserTreeNode userTreeNode = new UserTreeNode();
            BeanUtil.copyProperties(temp, userTreeNode);
            userTreeNodeList.add(userTreeNode);
        });
        JSONObject json = new JSONObject();
        json.put("userList", list);
        json.put("userTree", userTreeNodeList);
        return ApiResult.ok("获取用户树成功", json);
    }

    @PostMapping(value = "/list", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取系统管理-用户基础信息表列表", httpMethod = "POST", response = ApiResult.class)
    public ApiResult list(@RequestBody UserQueryPara filter) {
        List<User> result = userService.list(filter);
        return ApiResult.ok("获取系统管理-用户基础信息表列表成功", result);
    }

    @PostMapping(value = "/save", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "保存系统管理-用户基础信息表", httpMethod = "POST", response = ApiResult.class)
    // groups和默认校验同时应用 - 没有groups的属性和有groups的属性要想同时校验，则必须在value数组中同时指明，启动没有groups的属性通过Default.class来指定
    public ApiResult save(@RequestBody @Validated User input) {
        Integer id = userService.saveUser(input);
        return ApiResult.ok("保存系统管理-用户基础信息表成功", id);
    }

    @PostMapping(value = "/updatePersonalInfo", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "修改个人信息", httpMethod = "POST", response = ApiResult.class)
    public ApiResult updatePersonalInfo(@RequestBody User input) {
        Integer id = userService.updatePersonalInfo(input);
        return ApiResult.ok("修改个人信息成功", id);
    }

    @PostMapping(value = "/delete", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "删除系统管理-用户基础信息表", httpMethod = "POST", response = ApiResult.class)
    public ApiResult delete(@RequestBody UserQueryPara input) {
        userService.removeById(input.getId());
        return ApiResult.ok("删除系统管理-用户基础信息表成功");
    }

    @PostMapping(value = "/getById", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取系统管理-用户基础信息表信息", httpMethod = "POST", response = ApiResult.class)
    public ApiResult getById(@RequestBody UserQueryPara input) {
        User entity = userService.getById(input.getId());
        return ApiResult.ok("获取系统管理-用户基础信息表信息成功", entity);
    }

}
