package com.moha.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: ResponseVO
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO<T> {

    private Integer code;
    private String message;
    private T data;

    public ResponseVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public ResponseVO ok(T object){
        ResponseVO responseVO= new ResponseVO(ResponseCodeEnum.SUCCESS.getCode(),ResponseCodeEnum.SUCCESS.getMessage(),object);
        return responseVO;
    }
    public ResponseVO fail(){
        ResponseVO responseVO= new ResponseVO(ResponseCodeEnum.NO_INFORMATION.getCode(),ResponseCodeEnum.NO_INFORMATION.getMessage());
        return responseVO;
    }
    public ResponseVO fail(T object){
        ResponseVO responseVO= new ResponseVO(ResponseCodeEnum.NO_INFORMATION.getCode(),ResponseCodeEnum.NO_INFORMATION.getMessage(),object);
        return responseVO;
    }

    @Override
    public String toString() {
        return "ResponseVO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", Data=" + data +
                '}';
    }
}
