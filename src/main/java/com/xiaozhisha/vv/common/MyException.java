package com.xiaozhisha.vv.common;
/**
 * 自定义异常类
 * @author lx
 * @date 2019/5/1 14:24
 */
public class MyException extends RuntimeException{
    private String errorCode;
    private  boolean propertiesKey;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isPropertiesKey() {
        return propertiesKey;
    }

    public void setPropertiesKey(boolean propertiesKey) {
        this.propertiesKey = propertiesKey;
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String errorCode,String message){
        this(message);
    }

    public MyException(String errorCode,String message, boolean propertiesKey){
        super(message);
        this.setErrorCode(errorCode);
        this.setPropertiesKey(propertiesKey);
    }

}
