package com.fancy.network.bean;

/**
 * @author pengkuanwang
 * @date 2019-06-14
 */
public class HttpResult<T> {
    public String respCode;
    public String respMsg;
    public T data;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMessage() {
        return respMsg;
    }

    public void setRespMessage(String respMessage) {
        this.respMsg = respMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
