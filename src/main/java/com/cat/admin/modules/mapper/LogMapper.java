package com.cat.admin.modules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cat.admin.modules.dto.input.LogQueryPara;
import com.cat.admin.modules.entity.SysLog;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p> 系统管理 - 日志表 Mapper 接口 </p>
 *
 * @author : cat
 * @date : 2020-06-06
 */
public interface LogMapper extends BaseMapper<SysLog> {

    /**
     * 列表分页
     *
     * @param page
     * @param filter
     * @return
     */
    List<SysLog> selectLogs(Pagination page, @Param("filter") LogQueryPara filter);

    /**
     * 列表
     *
     * @param filter
     * @return
     */
    List<SysLog> selectLogs(@Param("filter") LogQueryPara filter);

}
