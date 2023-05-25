package com.work.common.base.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Result
 * 通用返回结果
 * @author wmy
 * @date 2023/4/13 15:21
 */
@Data
public class Result<T> implements Serializable {

    private static final Long serialVersionUID = 1L;

    private Integer code;

    private String message;

    private T data;

    private String traceId;

    public Result(){
        this.code = 200;
        this.message = "OK";
    }

    public Result(T data){
        this.code = 200;
        this.message = "OK";
        this.data = data;
    }

    public Result(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Result(Integer code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(Integer code,String message,T data,String traceId){
        this.code = code;
        this.message = message;
        this.data = data;
        this.traceId = traceId;
    }
}
