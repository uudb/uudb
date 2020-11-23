package com.study.design.builder;

/**
 * Project Name: uudb
 * Package Name: com.study.design.builder
 * date:  2020/11/23-17:28
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class TestBuilder {

    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareAllMeal();
        meal.showCost();
        meal.showMsg();

        Meal meal1 = mealBuilder.prepareVegMeal();
        meal1.showCost();
        meal1.showMsg();

        Meal meal2 = mealBuilder.prepareChickenMeal();
        meal2.showCost();
        meal2.showMsg();
    }
}
