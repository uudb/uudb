package com.study.design.builder;

import java.math.BigDecimal;

/**
 * Project Name: uudb
 * Package Name: com.study.design.builder
 * date:  2020/11/23-17:12
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public abstract class ColdBottle extends Bottle implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
