package com.cat.admin.modules.service.impl;

import com.cat.admin.core.enums.DataSourceEnum;
import com.cat.admin.core.annotation.DataSource;
import com.cat.admin.modules.entity.AccountEntity;
import com.cat.admin.modules.mapper.AccountMapper;
import com.cat.admin.modules.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author cat
 * @since 2020-05-16
 */
@Transactional
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountEntity> implements AccountService {

    @DataSource(DataSourceEnum.DB1)
    public List<Map<String, Object>> selectAccount(){
        return baseMapper.selectAccount();
    }

    @DataSource(DataSourceEnum.DB2)
    public List<Map<String, Object>> selectAccount2(){
        return baseMapper.selectAccount2();
    }
}
