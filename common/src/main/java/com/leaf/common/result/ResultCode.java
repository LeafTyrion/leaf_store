package com.leaf.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author YeYaqiao
 * @email yaqiao.ye@mobilityasia.com.cn
 * @time 2020-06-15 14:34
 */
@Getter
@AllArgsConstructor
public enum ResultCode {
    /**
     * 返回结果枚举类
     */
    FAILED(-1,false,"failed"),
    SUCCEED(0,true,"succeed");

    private final int code;
    private final boolean status;
    private final String message;


}
