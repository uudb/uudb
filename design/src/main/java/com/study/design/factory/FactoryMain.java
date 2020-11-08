package com.study.design.factory;

/**
 * Project Name: uudb
 * Package Name: com.study.design.factory
 * date:  2020/11/8-17:07
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class FactoryMain {

    public static void main(String[] args){
        SportsFactory sf = new SportsFactory();

        Sports st1 = sf.playGame(GamesType.basketball.getType());
        st1.play();

        Sports st2 = sf.playGame(GamesType.football.getType());
        st2.play();

        Sports st3 = sf.playGame(GamesType.shuttlecock.getType());
        st3.play();
    }
}
