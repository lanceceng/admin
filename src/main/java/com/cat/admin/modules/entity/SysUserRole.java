package com.cat.admin.modules.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户角色关系表(SysUserRole)实体类
 *
 * @author makejava
 * @since 2020-05-31 23:38:28
 */
@Data
public class SysUserRole implements Serializable {
    private static final long serialVersionUID = -33060556322832965L;
    /**
    * 用户Id
    */
    private String userId;
    /**
    * 角色Id
    */
    private String roleId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}