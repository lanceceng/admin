package com.cat.admin.modules.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色权限表
 * </p>
 *
 * @author cat
 * @since 2020-05-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("role_permission")
public class RolePermissionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色Id
     */
    private Long roleId;

    /**
     * 权限Id
     */
    private Long permissionId;


}
