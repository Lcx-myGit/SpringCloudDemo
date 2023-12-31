package com.Lcx.SpringCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    public CommonResult( Integer code,String message) {
        this( code, message,null);
    }
    public CommonResult(T data) {
        this(200, "操作成功", data);
    }
}