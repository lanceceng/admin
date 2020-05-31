package com.cat.admin.modules.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 权限表(SysPermit)实体类
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@Data
public class SysPermit implements Serializable {
    private static final long serialVersionUID = 231964968053706646L;
    /**
    * Id
    */
    private Integer id;
    /**
    * 逻辑Id
    */
    private String bizid;
    /**
    * 父级id
    */
    private String parentId;
    /**
    * 权限对应的资源
    */
    private String resource;
    /**
    * 权限的代码/通配符,对应代码中@hasAuthority(xx)
    */
    private String code;
    /**
    * 对应的资源操作
    */
    private String handle;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBizid() {
        return bizid;
    }

    public void setBizid(String bizid) {
        this.bizid = bizid;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

}