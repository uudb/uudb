package com.study.design.adapt;

/**
 * Project Name: uudb
 * Package Name: com.study.design.adapt
 * date:  2021/1/22-16:18
 * Copyright (c) 2021, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class PaperCup implements Cup{

    @Override
    public void layUpWater() {

    }

    @Override
    public void layUpTea() {
        System.out.println("lay up tea");
    }
}
