package com.leaf.common.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author YeYaqiao
 * @email yaqiao.ye@mobilityasia.com.cn
 * @time 2020-06-15 14:35
 */
@Getter
@Setter
@AllArgsConstructor
public class Result<T> {
    @ApiModelProperty(value = "返回码")
    private int code;
    @ApiModelProperty(value = "返回状态")
    private boolean status;
    @ApiModelProperty(value = "返回消息")
    private String message;
    @ApiModelProperty(value = "返回数据")
    private T data;

    private Result() {
    }

    public static <T> Result<T> ok() {
        Result<T> result = new Result<>();
        result.code = ResultCode.SUCCEED.getCode();
        result.status = ResultCode.SUCCEED.isStatus();
        result.message = ResultCode.SUCCEED.getMessage();
        return result;
    }

    public static <T> Result<T> error() {
        Result<T> result = new Result<>();
        result.code = ResultCode.FAILED.getCode();
        result.status = ResultCode.FAILED.isStatus();
        result.message = ResultCode.FAILED.getMessage();
        return result;
    }

    public Result<T> code(int code) {
        this.setCode(code);
        return this;
    }

    public Result<T> status(boolean status) {
        this.setStatus(status);
        return this;
    }

    public Result<T> message(String message) {
        this.setMessage(message);
        return this;
    }

    public Result<T> data(T data) {
        this.setData(data);
        return this;
    }


}
