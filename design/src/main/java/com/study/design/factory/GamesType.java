package com.study.design.factory;

/**
 * Project Name: uudb
 * Package Name: com.study.design.factory
 * date:  2020/11/8-14:55
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public enum GamesType {

    football(1,"football"),
    basketball(2, "basketball"),
    shuttlecock(3, "shuttlecock");

    /**
     * 类型
     */
    private Integer type;

    /**
     * 描述
     */
    private String desc;

    GamesType(Integer type, String desc){
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
