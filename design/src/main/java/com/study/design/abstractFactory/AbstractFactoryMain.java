package com.study.design.abstractFactory;

import com.study.design.factory.GamesType;

/**
 * Project Name: uudb
 * Package Name: com.study.design.abstractFactory
 * date:  2020/11/13-18:04
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class AbstractFactoryMain {

    public static void main(String[] args){
        AbstractSportsFactory asf = FactoryProducer.getFactory("color");
        asf.fillColor(ColorType.whiteF.getType()).fill();
        asf.fillColor(ColorType.blackF.getType()).fill();

        AbstractSportsFactory sport = FactoryProducer.getFactory("sport");
        sport.playGame(GamesType.football.getType()).play();
        sport.playGame(GamesType.basketball.getType()).play();
        sport.playGame(GamesType.shuttlecock.getType()).play();
    }

}
