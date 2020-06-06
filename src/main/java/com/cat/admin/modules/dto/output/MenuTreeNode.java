package com.cat.admin.modules.dto.output;

import com.cat.admin.modules.entity.Menu;
import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 *  <p> 菜单树节点 </p>
 *
 * @description :
 * @author : cat
 * @date : 2020/06/06
 */
@Data
public class MenuTreeNode extends Menu {

    List<MenuTreeNode> children = Lists.newArrayList();

}
