package com.cat.admin.core.exception;

import com.cat.admin.core.utils.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理类
 * controller层异常无法捕获处理，需要自己处理
 * Created by jt on 2018/8/27.
 */
@RestControllerAdvice
@Slf4j
public class DefaultExceptionHandler {

    /**
     * 处理所有自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(CustomException.class)
    public ResultJson handleCustomException(CustomException e){
        log.error(e.getResultJson().getMsg());
        return e.getResultJson();
    }
}
