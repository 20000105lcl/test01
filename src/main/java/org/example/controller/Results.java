package org.example.controller;

/**
 * @description:
 * @Title: Results
 * @Author: 刘成龙
 * @Version:1.0
 * @time: 2022/12/04 17:26
 */
public class Results {

    private Integer code;
    private Object data;
    private String msg;

    public Results(){
    }

    public Results(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Results(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
