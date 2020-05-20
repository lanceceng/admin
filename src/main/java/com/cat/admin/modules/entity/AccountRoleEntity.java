package com.cat.admin.modules.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author cat
 * @since 2020-05-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("account_role")
public class AccountRoleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户Id
     */
    private Long accountId;

    /**
     * 角色Id
     */
    private Long roleId;


}
