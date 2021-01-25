package com.study.design.adapt;

/**
 * Project Name: uudb
 * Package Name: com.study.design.adapt
 * date:  2021/1/22-16:33
 * Copyright (c) 2021, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class TestAdapter {

    public static void main(String[] args){
        CupI cupI = new CupI();
        cupI.layUp(1);
        cupI.layUp(2);
    }
}
