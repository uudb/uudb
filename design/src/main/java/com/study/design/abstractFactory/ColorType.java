package com.study.design.abstractFactory;

/**
 * Project Name: uudb
 * Package Name: com.study.design.abstractFactory
 * date:  2020/11/13-17:57
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public enum ColorType {
    whiteF(1,"red"),
    blackF(2, "black");

    private Integer type;

    private String desc;

    ColorType(Integer type, String desc){
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
