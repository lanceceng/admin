package com.cat.admin.modules.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cat.admin.core.api.BaseController;
import com.cat.admin.core.utils.ApiResult;
import com.cat.admin.modules.dto.input.LogQueryPara;
import com.cat.admin.modules.entity.SysLog;
import com.cat.admin.modules.service.ILogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p> 系统管理 - 日志表 接口 </p>
 *
 * @author: cat
 * @description:
 * @date: 2020-06-06
 *
 */
@RestController
@RequestMapping("/api/system/log")
@Api(description = "系统管理 - 日志表接口")
public class SysLogController extends BaseController {

    @Autowired
    ILogService logService;

    @PostMapping(value = "/listPage", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取系统管理 - 日志表列表分页", httpMethod = "POST", response = ApiResult.class)
    public ApiResult listPage(@RequestBody LogQueryPara filter) {
        Page<SysLog> page = new Page<>(filter.getPage(),filter.getLimit());
        logService.listPage(page, filter);
        return ApiResult.ok("获取系统管理 - 日志表列表分页成功", page);
    }

//    @PostMapping(value = "/list", produces = "application/json;charset=utf-8")
//    @ApiOperation(value = "获取系统管理 - 日志表列表", httpMethod = "POST", response = ApiResult.class)
//    public ApiResult list(@RequestBody LogInput filter) {
//        List<Log> result = logService.list(filter);
//        return ApiResult.ok("获取系统管理 - 日志表列表成功",result);
//    }
//
//    @PostMapping(value = "/saveOrUpdate", produces = "application/json;charset=utf-8")
//    @ApiOperation(value = "保存或更新系统管理 - 日志表", httpMethod = "POST", response = ApiResult.class)
//    public ApiResult saveOrUpdate(@RequestBody Log input) {
//        Integer id = logService.save(input);
//        return ApiResult.ok("保存系统管理 - 日志表成功", id);
//    }
//
//    @PostMapping(value = "/delete", produces = "application/json;charset=utf-8")
//    @ApiOperation(value = "删除系统管理 - 日志表", httpMethod = "POST", response = ApiResult.class)
//    public ApiResult delete(@RequestBody LogInput input) {
//        logService.deleteById(input.getId());
//        return ApiResult.ok("删除系统管理 - 日志表成功");
//    }
//
//    @PostMapping(value = "/detail", produces = "application/json;charset=utf-8")
//    @ApiOperation(value = "根据ID获取系统管理 - 日志表信息", httpMethod = "POST", response = ApiResult.class)
//    public ApiResult detail(@RequestBody LogInput input) {
//        Log entity = logService.selectById(input.getId());
//        return ApiResult.ok("根据ID获取系统管理 - 日志表信息成功", entity);
//    }

}
