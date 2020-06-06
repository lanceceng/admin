package com.cat.admin.modules.dto.input;

import com.cat.admin.modules.dto.base.BasePageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 系统管理-菜单表 查询参数
 *
 * @author: cat
 * @description:
 * @date: 2020-06-06
 */
@Data
@ApiModel(description = "系统管理-菜单表 查询参数")
public class MenuQueryPara extends BasePageQuery {
    @ApiModelProperty(value = "id")
    private Integer id;
}
