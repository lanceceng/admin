package com.cat.admin.modules.controller;


import com.cat.admin.core.distLock.NoRepeatSubmit;
import com.cat.admin.core.utils.RedisUtil;
import com.cat.admin.modules.entity.AccountEntity;
import com.cat.admin.modules.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author cat
 * @since 2020-05-16
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/page")
    public Object selectPage(){
        List<AccountEntity> list = accountService.list();
        return list;
    }

    @GetMapping("/list")
    public Object selectAccount(){
        List<Map<String, Object>> list = accountService.selectAccount();
        return list;
    }

    @GetMapping("/list2")
    @NoRepeatSubmit
    public Object selectAccount2(){
        redisUtil.set("gg", "213");
        List<Map<String, Object>> list = accountService.selectAccount2();
        Object obj = redisUtil.get("gg");
        System.out.println(obj);
        return list;
    }
}
