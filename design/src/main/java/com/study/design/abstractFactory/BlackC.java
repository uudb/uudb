package com.study.design.abstractFactory;

/**
 * Project Name: uudb
 * Package Name: com.study.design.abstractFactory
 * date:  2020/11/13-17:55
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class BlackC implements ColorF {

    @Override
    public void fill() {
        System.out.println("fill black");
    }
}
