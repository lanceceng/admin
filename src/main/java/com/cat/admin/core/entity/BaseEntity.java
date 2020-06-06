package com.cat.admin.core.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 *  <p> 修改时间 </p>
 *
 * @description:
 * @author: cat
 * @date: 2020-06-06
 */
@Getter
@Setter
public abstract class BaseEntity<T extends Model> extends Model<T>{

    /**
     * 创建日期 - 现在时表示主动创建
     */
    @ApiModelProperty(value = "创建日期")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @Past(message = "创建时间必须是过去时间")
    private Date createTime;

    /**
     * 修改时间 - 过去分词表示被动更新
     */
    @ApiModelProperty(value = "修改时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
//    @Future(message = "修改时间必须是将来时间") 这个注解没搞懂
    private Date updateTime;

    /**
     * 创建人
     */
    @TableField(value = "create_id", fill = FieldFill.INSERT)
    private Integer createId;

    /**
     * 修改人
     */
    @TableField(value = "update_id", fill = FieldFill.INSERT_UPDATE)
    private Integer updateId;

    /**
     * 是否可用
     */
//    @TableField(fill = FieldFill.INSERT)
//    private Boolean availableFlag;
}
