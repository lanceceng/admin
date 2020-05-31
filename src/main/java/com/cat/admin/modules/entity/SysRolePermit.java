package com.cat.admin.modules.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 角色权限关系表(SysRolePermit)实体类
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@Data
public class SysRolePermit implements Serializable {
    private static final long serialVersionUID = 429310163503196909L;
    /**
    * 角色Id
    */
    private String roleId;
    /**
    * 权限Id
    */
    private String permitId;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermitId() {
        return permitId;
    }

    public void setPermitId(String permitId) {
        this.permitId = permitId;
    }

}