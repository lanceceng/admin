package com.cat.admin.modules.dto.input;

import com.cat.admin.modules.dto.base.BasePageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 系统管理 - 角色-菜单关联表 查询参数
 *
 * @author: cat
 * @description:
 * @date: 2020-06-06
 */
@Data
@ApiModel(description = "系统管理 - 角色-菜单关联表 查询参数")
public class RoleMenuQueryPara extends BasePageQuery {
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "角色ID")
    private Integer roleId;
    @ApiModelProperty(value = "菜单ids")
    private String menuIds;
}
