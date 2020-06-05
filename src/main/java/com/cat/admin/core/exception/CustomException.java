package com.cat.admin.core.exception;

import com.cat.admin.core.utils.ResultJson;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private ResultJson resultJson;

    public CustomException(ResultJson resultJson) {
        this.resultJson = resultJson;
    }
}
