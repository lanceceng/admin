package com.cat.admin.modules.dto.output;

import com.cat.admin.modules.entity.User;
import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 *  <p> 用户树节点 </p>
 *
 * @description :
 * @author : cat
 * @date : 2020-06-06
 */
@Data
public class UserTreeNode extends User {

    List<UserTreeNode> children = Lists.newArrayList();

}
