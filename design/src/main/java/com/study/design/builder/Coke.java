package com.study.design.builder;

import java.math.BigDecimal;

/**
 * Project Name: uudb
 * Package Name: com.study.design.builder
 * date:  2020/11/23-17:15
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class Coke extends ColdBottle {

    @Override
    public String name() {
        return "coke";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(7);
    }
}
