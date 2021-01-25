package com.study.design.adapt;

/**
 * Project Name: uudb
 * Package Name: com.study.design.adapt
 * date:  2021/1/22-16:28
 * Copyright (c) 2021, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class CupAdapterImpl implements CupAdapter{

    Cup cup;

    /**
     * 这里用一句话描述这个方法的作用
     * @param type 1-玻璃杯  2-纸杯
     * @return
     * @author zhengyamin
     * @date
    */
    public CupAdapterImpl(Integer type){
        if(type == 1){
            cup = new Glasses();
        }else if(type == 2){
            cup = new PaperCup();
        }
    }

    /**  
     * 这里用一句话描述这个方法的作用 
     * @param type   1-玻璃杯  2-纸杯
     * @return void  
     * @author zhengyamin
     * @date 2021/1/22 16:32   
    */
    @Override
    public void layUp(Integer type) {
        if(type == 1){
            cup.layUpWater();
        }else if(type == 2){
            cup.layUpTea();
        }

    }
}
