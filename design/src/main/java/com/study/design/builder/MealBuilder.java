package com.study.design.builder;

/**
 * Project Name: uudb
 * Package Name: com.study.design.builder
 * date:  2020/11/23-17:23
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class MealBuilder {

    /**  
     * 生成蔬菜套餐
     * @param
     * @return com.study.design.builder.Meal  
     * @author zhengyamin
     * @date 2020/11/23 17:28   
    */
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**  
     * 生成鸡肉套餐
     * @param
     * @return com.study.design.builder.Meal  
     * @author zhengyamin
     * @date 2020/11/23 17:27   
    */
    public Meal prepareChickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    /**  
     * 生成全家桶
     * @param
     * @return com.study.design.builder.Meal  
     * @author zhengyamin
     * @date 2020/11/23 17:27   
    */
    public Meal prepareAllMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
