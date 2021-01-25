package com.study.design.bridge;

/**
 * Project Name: uudb
 * Package Name: com.study.design.bridge
 * date:  2021/1/25-17:06
 * Copyright (c) 2021, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class Water implements Draw {

    @Override
    public void drawing(String tool) {
        System.out.println(tool + " draw water");
    }
}
