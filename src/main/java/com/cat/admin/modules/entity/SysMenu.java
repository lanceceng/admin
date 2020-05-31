package com.cat.admin.modules.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;

/**
 * 菜单表(SysMenu)实体类
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@Data
public class SysMenu implements Serializable {
    private static final long serialVersionUID = 954119052553733326L;
    /**
    * Id
    */
    private Integer id;
    /**
    * 逻辑Id
    */
    private String bizid;
    /**
    * 菜单编码
    */
    private String menuCode;
    /**
    * 菜单名称
    */
    private String menuName;
    /**
    * 菜单级别
    */
    private Integer menuLevel;
    /**
    * 父级Id
    */
    private String parentId;
    /**
    * 链接地址
    */
    private String url;
    /**
    * 权限
    */
    private String permit;
    /**
    * 图标
    */
    private String icon;
    /**
    * 路由名称
    */
    private String routerName;
    /**
    * 排序
    */
    private Integer sort;
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

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRouterName() {
        return routerName;
    }

    public void setRouterName(String routerName) {
        this.routerName = routerName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}