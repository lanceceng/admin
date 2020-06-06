package com.cat.admin.modules.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cat.admin.modules.dto.input.MenuQueryPara;
import com.cat.admin.modules.entity.Menu;

import java.util.List;

/**
 * <p>  系统管理-菜单表  服务类 </p>
 *
 * @author: cat
 * @date: 2020-06-06
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 菜单树
     *
     * @param :
     * @return: java.util.List<com.cat.modules.system.entity.Menu>
     */
    List<Menu> listTreeMenu();

    /**
     * 系统管理-菜单表 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
    void listPage(Page<Menu> page, MenuQueryPara filter);

    /**
     * 保存系统管理-菜单表
     *
     * @param input
     */
    Integer saveMenu(Menu input);

    /**
     * 系统管理-菜单表 列表
     *
     * @param filter
     * @return
     */
    List<Menu> list(MenuQueryPara filter);
}
