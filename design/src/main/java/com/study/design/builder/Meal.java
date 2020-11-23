package com.study.design.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Project Name: uudb
 * Package Name: com.study.design.builder
 * date:  2020/11/23-17:18
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class Meal {

    private List<Item> itemList = new ArrayList();

    public void addItem(Item item){
        itemList.add(item);
    }

    public void showCost(){
        BigDecimal totalCost = BigDecimal.ZERO;
        for(Item item : itemList){
            totalCost = totalCost.add(item.price());
        }
        System.out.println(totalCost);
    }

    public void showMsg(){
        for(Item item : itemList){
            System.out.println("name:" + item.name() + "   price:" + item.price() + "  wrapper:" + item.packing().pack());
        }
    }
}
