package com.cat.admin.core.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.cat.admin.core.config.security.dto.SecurityUser;
import com.cat.admin.core.config.security.service.impl.IAuthenticationFacade;
import com.cat.admin.core.utils.DateTimeUtils;
import com.cat.admin.modules.entity.User;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Date;

/**
 * <p> MyBatisPlus自定义字段自动填充处理类 - 实体类中使用 @TableField注解 </p>
 *
 *  * 配置公共字段自动填充功能  @TableField(..fill = FieldFill.INSERT)
 *  * 特别注意，3.0-gamma之前的版本 MetaObjectHandler 是抽象类
 *  * 3.0-RC之后的版本MetaObjectHandler 是接口
 *
 * @description: 注意前端传值时要为null
 * @author: cat
 * @date: 2020-06-06
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler, IAuthenticationFacade {

    private static final Logger LOG = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @Override
    public User getCurrentUser(){
        Authentication authentication = this.getAuthentication();
        SecurityUser userDetails = (SecurityUser) authentication.getPrincipal();
        User currentUser = userDetails.getCurrentUserInfo();
        return currentUser;
    }
    /**
     * 创建时间
     */
    @Override
    public void insertFill(MetaObject metaObject) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (!(authentication instanceof AnonymousAuthenticationToken)) {
//            String currentUserName = authentication.getName();
//
//        }
        User user = this.getCurrentUser();
        LOG.info(" -------------------- start insert fill ...  --------------------");
        if (metaObject.hasGetter("createTime") && metaObject.hasGetter("updateTime")
                && metaObject.hasGetter("createId") && metaObject.hasGetter("updateId")) {
            setFieldValByName("createTime", new Date(), metaObject);
            setFieldValByName("updateTime", new Date(), metaObject);
            setFieldValByName("createId", user.getId(), metaObject);
            setFieldValByName("updateId", user.getId(), metaObject);
        }

        // 日志输出 ================================================================================================
        Date createTime = (Date) this.getFieldValByName("createTime", metaObject);
        Date updateTime = (Date) this.getFieldValByName("updateTime", metaObject);
        if (createTime != null && updateTime != null) {
            try {
                LOG.info("MyBatisPlus自动填充处理 - createTime:{} updateTime:{}", DateTimeUtils.dateToDateTimeString(createTime), DateTimeUtils.dateToDateTimeString(updateTime));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 最后一次更新时间
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        User user = this.getCurrentUser();
        LOG.info(" -------------------- start update fill ...  --------------------");
        if (metaObject.hasGetter("et.updateTime") && metaObject.hasGetter("et.updateId")) {
            setFieldValByName("updateTime", new Date(), metaObject);
            setFieldValByName("updateId", user.getId(), metaObject);
        }

        // 日志输出 ================================================================================================
        Date updateTime = (Date) this.getFieldValByName("updateTime", metaObject);
        if (updateTime != null) {
            try {
                LOG.info("MyBatisPlus自动填充处理 - updateTime:{}", DateTimeUtils.dateToDateTimeString(updateTime));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

}
