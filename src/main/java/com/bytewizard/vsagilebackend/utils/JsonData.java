package com.bytewizard.vsagilebackend.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Yiguo
 * @since 2023-01-30
 */
@Getter
@Setter
public class JsonData {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 数据
     */
    private Object data;
    /**
     * 状态信息
     */
    private String msg;
    public JsonData(){}
    public JsonData(Integer code, Object data, String msg){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 成功
     */
    public static JsonData buildSuccess(){
        return new JsonData(0,null,null);
    }

    /**
     * 成功
     * @param data 数据
     */
    public static JsonData buildSuccess(Object data){
        return new JsonData(0,data,null);
    }

    /**
     * 成功
     * @param data 数据
     * @param msg 状态信息
     */
    public static JsonData buildSuccess(Object data,String msg){
        return new JsonData(0,data,msg);
    }

    /**
     * 失败
     * @param msg 数据
     */
    public static JsonData buildError(String msg){
        return new JsonData(-1,null,msg);
    }

    /**
     * 失败
     * @param code 状态码
     * @param msg 数据
     */
    public static JsonData buildError(Integer code,String msg){
        return new JsonData(code,null,msg);
    }
}
