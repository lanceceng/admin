package com.cat.admin.modules.mapper;

import com.cat.admin.modules.entity.AccountEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author cat
 * @since 2020-05-16
 */
public interface AccountMapper extends BaseMapper<AccountEntity> {

    List<Map<String, Object>> selectAccount();

    List<Map<String, Object>> selectAccount2();
}
