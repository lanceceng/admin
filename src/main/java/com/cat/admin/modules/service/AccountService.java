package com.cat.admin.modules.service;

import com.cat.admin.modules.entity.AccountEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author cat
 * @since 2020-05-16
 */
public interface AccountService extends IService<AccountEntity> {

    List<Map<String, Object>> selectAccount();

    List<Map<String, Object>> selectAccount2();
}
