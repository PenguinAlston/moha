package com.moha.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public enum ResponseCodeEnum {

    SUCCESS(200,"成功获取数据"),
    HTTP_NOT_FOUND(404,"未找到相关内容"),
    NO_INFORMATION(300,"查询结果为空");

    private final int code;
    private final String message;

    ResponseCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
