package com.cat.admin.modules.controller;

import com.cat.admin.core.api.BaseController;
import com.cat.admin.core.utils.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  <p> 首页 </p>
 *
 * @description :
 * @author : cat
 * @date : 2020-06-06
 */
@RestController
@Api(description = "首页-接口")
public class IndexController extends BaseController {

    @GetMapping(value = "/login", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "登录系统", httpMethod = "GET", response = ApiResult.class)
    public ApiResult login() {
        return ApiResult.ok("登录系统成功", null);
    }

}
