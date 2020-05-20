package com.cat.admin.modules.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author cat
 * @since 2020-05-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("permission")
public class PermissionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限Id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

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


}
