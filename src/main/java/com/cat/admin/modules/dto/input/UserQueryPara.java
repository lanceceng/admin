package com.cat.admin.modules.dto.input;

import com.cat.admin.modules.dto.base.BasePageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 系统管理-用户基础信息表查询参数
 *
 * @author: cat
 * @description:
 * @date: 2020-06-06
 */
@Data
@ApiModel(description = "系统管理-用户基础信息表查询参数")
public class UserQueryPara extends BasePageQuery {

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "账号")
    private String username; //security的就是全小写的username命名，保持跟它一致，没办法

    @ApiModelProperty(value = "账号 - 修改个人信息使用")
    private String account;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "QQ第三方登录授权认证成功后的openID")
    private String openId;

    @ApiModelProperty(value = "QQ第三方登录授权认证成功后的token")
    private String accessToken;

}
