package com.xiaozhisha.vv.constantEnum;

public enum PageHelp {
    pageSize(1,"起始页"),
    pageNum (3,"每页条数");

    private final String name;
    private final int num;

    PageHelp(int num, String name) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
}
