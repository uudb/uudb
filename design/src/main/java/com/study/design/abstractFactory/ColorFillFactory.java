package com.study.design.abstractFactory;

/**
 * Project Name: uudb
 * Package Name: com.study.design.abstractFactory
 * date:  2020/11/13-17:52
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class ColorFillFactory extends AbstractSportsFactory {

    @Override
    ColorF fillColor(Integer type) {
        if(type.compareTo(ColorType.whiteF.getType()) == 0){
            return new WhiteC();
        }else if(type.compareTo(ColorType.blackF.getType()) == 0 ){
            return new BlackC();
        }
        return null;
    }
}
