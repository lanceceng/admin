package com.cat.admin.modules.dto.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *  <p> 基类查询参数 </p>
 *
 * @description:
 * @author: cat
 * @date: 2020-06-06
 */
@ApiModel(description = "基类查询参数")
@Data
public class BaseQuery extends BasePageQuery{
    @ApiModelProperty(value = "用户ID")
    private Integer userId;
}
