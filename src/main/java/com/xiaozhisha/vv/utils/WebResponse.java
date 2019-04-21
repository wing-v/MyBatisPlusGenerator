package com.xiaozhisha.vv.utils;

/**
 *  响应包装类
 * @author lx
 * @date 2019/4/16 21:21
 * @param
 * @return
 */
public class   WebResponse<T> {
    private String resultCode = "0000";
    private String resultMessage = "请求成功";
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

    public static <T> WebResponse<T> getResponse(String resultCode,String message){
            WebResponse<T> res = new WebResponse<T>();
            res.setResultCode(resultCode);
            res.setResultMessage(message);
            return res;
    }

    public static <T> WebResponse<T> getWebResponse(T json){
        WebResponse<T> response = new WebResponse<>();
        response.setData(json);
        return null;
    }

    public boolean responseIsSucc(){
        return "0000".equals(resultCode);
    }

    public static <T>WebResponse<T> getSucWebResponse(T result){
        WebResponse<T> webResponse = new WebResponse<T>();
        webResponse.setData(result);
        return webResponse;
    }
}
