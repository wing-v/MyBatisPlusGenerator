package com.xiaozhisha.vv.enums;

public enum PageHelp {
    pageNum (1,"每页条数"),
    pageSize(2,"起始页");

    private final String name;
    private final int code;

    PageHelp(int code, String name) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;

    }

    public int getCode() {
        return code;
    }
}
