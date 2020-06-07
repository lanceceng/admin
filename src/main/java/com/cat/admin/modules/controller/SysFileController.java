package com.cat.admin.modules.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cat.admin.core.api.BaseController;
import com.cat.admin.core.utils.ApiResult;
import com.cat.admin.modules.dto.input.RoleQueryPara;
import com.cat.admin.modules.entity.Role;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *  <p> 系统文件 </p>
 *
 * @description :
 * @author : cat
 * @date : 2020-06-07
 */
@RestController
@RequestMapping("/api/system/file")
@Api(description = "系统文件")
@Slf4j
public class SysFileController extends BaseController {

    @PostMapping(value = "/listPage", produces = "application/json;charset=utf-8")
    @ApiOperation(value = "获取系统管理-文件表 列表分页", httpMethod = "POST", response = ApiResult.class)
    public ApiResult listPage(@RequestBody RoleQueryPara filter) {
        Page<Role> page = new Page<>(filter.getPage(),filter.getLimit());
//        roleService.listPage(page, filter);
        return ApiResult.ok("获取系统管理-文件表 列表分页成功", page);
    }

//    @PostMapping(value = "/list", produces = "application/json;charset=utf-8")
//    @ApiOperation(value = "获取系统管理-文件表 列表", httpMethod = "POST", response = ApiResult.class)
//    public ApiResult list(@RequestBody RoleQueryPara filter) {
//        List<Role> result = roleService.list(filter);
//        return ApiResult.ok("获取系统管理-文件表 列表成功",result);
//    }
//
//    @PostMapping(value = "/saveOrUpdate", produces = "application/json;charset=utf-8")
//    @ApiOperation(value = "保存或更新文件", httpMethod = "POST", response = ApiResult.class)
//    public ApiResult saveOrUpdate(@RequestBody @Validated Role input) {
//        Integer id = roleService.saveRole(input);
//        return ApiResult.ok("保存文件成功", id);
//    }
//
//    @PostMapping(value = "/delete", produces = "application/json;charset=utf-8")
//    @ApiOperation(value = "删除文件 ", httpMethod = "POST", response = ApiResult.class)
//    public ApiResult delete(@RequestBody RoleQueryPara input) {
//        roleService.removeById(input.getId());
//        return ApiResult.ok("删除文件成功");
//    }
//
//    @PostMapping(value = "/detail", produces = "application/json;charset=utf-8")
//    @ApiOperation(value = "获取文件信息", httpMethod = "POST", response = ApiResult.class)
//    public ApiResult detail(@RequestBody RoleQueryPara input) {
//        Role entity = roleService.getById(input.getId());
//        return ApiResult.ok("获取文件信息成功", entity);
//    }

    @PostMapping("/upload")
    @ResponseBody
    public ApiResult upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ApiResult.fail("上传失败，请选择文件");
        } /*else if(file.getContentType()){

        }*/
        String fileName = file.getOriginalFilename();
        String filePath = "D:\\files\\";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            log.info("上传成功");
            return ApiResult.ok("上传成功");
        } catch (IOException e) {
            log.error(e.toString(), e);
        }
        return ApiResult.fail("上传失败！");
    }
}
