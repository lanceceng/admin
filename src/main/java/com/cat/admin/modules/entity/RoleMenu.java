package com.cat.admin.modules.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.cat.admin.core.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>  系统管理 - 角色-菜单关联表  </p>
 *
 * @author: cat
 * @date: 2020-06-06
 */
@Data
@ApiModel(description = "系统管理 - 角色-菜单关联表 ")
@TableName("sys_role_menu")
public class RoleMenu extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@ApiModelProperty(value = "主键")
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 角色ID
     */
	@ApiModelProperty(value = "角色ID")
	@TableField("role_id")
	private Integer roleId;
    /**
     * 菜单ID
     */
	@ApiModelProperty(value = "菜单ID")
	@TableField("menu_id")
	private Integer menuId;

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
