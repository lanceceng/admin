package com.cat.admin.modules.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cat.admin.modules.dto.input.LogQueryPara;
import com.cat.admin.modules.entity.SysLog;

import java.util.List;

/**
 * <p>  系统管理 - 日志表 服务类 </p>
 *
 * @author: cat
 * @date: 2020-06-06
 */
public interface ILogService extends IService<SysLog> {

    /**
     * 系统管理 - 日志表列表分页
     *
     * @param page
     * @param para
     * @return
     */
    void listPage(Page<SysLog> page, LogQueryPara para);

    /**
     * 保存系统管理 - 日志表
     *
     * @param input
     */
    Integer saveLog(SysLog input);

    /**
     * 系统管理 - 日志表列表
     *
     * @param para
     * @return
     */
    List<SysLog> list(LogQueryPara para);

}
