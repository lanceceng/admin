package com.cat.admin.core.config.security.service.impl;

import com.cat.admin.modules.entity.User;
import org.springframework.security.core.Authentication;

public interface IAuthenticationFacade {
    /**
     * 获取当前登录用户信息，以接口的方式实现
     * @return
     */
    Authentication getAuthentication();

    User getCurrentUser();

    //    @Override
//    public Authentication getAuthentication() {
//        return SecurityContextHolder.getContext().getAuthentication();
//    }
//
//    @Override
//    public User getCurrentUser(){
//        Authentication authentication = this.getAuthentication();
//        SecurityUser userDetails = (SecurityUser) authentication.getPrincipal();
//        User currentUser = userDetails.getCurrentUserInfo();
//        return currentUser;
//    }
}
