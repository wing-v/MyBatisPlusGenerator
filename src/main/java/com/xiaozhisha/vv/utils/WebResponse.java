package com.xiaozhisha.vv.utils;
/**
 *  响应包装类
 * @author lx
 * @date 2019/4/16 21:21
 * @param
 * @return
 */
public class   WebResponse<T> {
    private String resultCode;
    private String resultMessage;
    private T data;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public WebResponse(String resultCode, String resultMessage, T data) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.data = data;
    }

    public WebResponse() { }

    public WebResponse getSucWebResponse(T result){
        WebResponse webResponse = new WebResponse();
        webResponse.setResultCode("0000");
        webResponse.setResultMessage("请求成功");
        webResponse.setData(result);
        return webResponse;
    }
}
