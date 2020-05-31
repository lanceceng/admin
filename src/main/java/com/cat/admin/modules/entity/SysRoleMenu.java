package com.cat.admin.modules.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 角色菜单关系表(SysRoleMenu)实体类
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@Data
public class SysRoleMenu implements Serializable {
    private static final long serialVersionUID = -14226137302614894L;
    /**
    * 角色Id
    */
    private String roleId;
    /**
    * 菜单Id
    */
    private String menuId;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

}