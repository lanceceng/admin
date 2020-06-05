package com.cat.admin.modules.controller;

import com.cat.admin.core.security.JwtTokenUtil;
import com.cat.admin.core.utils.ResultCode;
import com.cat.admin.core.utils.ResultJson;
import com.cat.admin.modules.entity.SysUser;
import com.cat.admin.modules.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户表(SysUser)表控制层
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public SysUser selectOne(Integer id) {
        return this.sysUserService.queryById(id);
    }

    @GetMapping(value = "/test")
    public Object test() {
        return sysUserService.getJson();
    }

    @PreAuthorize("hasAnyRole('USER')")
    @PostMapping(value = "/testNeed")
    public String testNeed() {
        return "testNeed";
    }

    //   登录
    @PostMapping("/login")
    public ResultJson login(@RequestBody SysUser sysUser, HttpServletRequest request){

        final UserDetails userDetails = userDetailsService.loadUserByUsername(sysUser.getUserName());
        final String token = jwtTokenUtil.generateToken(userDetails);
        ResultJson resultJson = new ResultJson(ResultCode.SUCCESS, token);
        return resultJson;
    }

    @PostMapping("/haha")
    public String haha(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "haha:"+userDetails.getUsername()+","+userDetails.getPassword();
    }

}