package com.cat.admin.modules.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户表(SysUser)实体类
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = 796206637798821807L;
    /**
    * Id
    */
    private Integer id;
    /**
    * 逻辑Id
    */
    private String bizid;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 登录名
    */
    private String loginName;
    /**
    * 用户编码
    */
    private String userCode;
    /**
    * 用户名称
    */
    private String userName;
    /**
    * 密码
    */
    private String password;
    /**
    * 注册时间
    */
    private Date registerTime;
    /**
    * 上一次登录时间
    */
    private Date loginTime;
    /**
    * 创建人id
    */
    private String createId;
    /**
    * 修改人id
    */
    private String updateId;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改时间
    */
    private Date updateTime;

    private String roleId;

}