package com.study.design.abstractFactory;

import com.study.design.factory.*;

/**
 * Project Name: uudb
 * Package Name: com.study.design.factory
 * date:  2020/11/8-13:25
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class SportsFactory extends AbstractSportsFactory{

    /***  
     * 这里用一句话描述这个方法的作用 
     * @param type  1-basketball 2-football 3-shuttlecock
     * @return com.study.design.factory.Sports  
     * @author zhengyamin
     * @date 2020/11/8 14:54   
    */
    @Override
    public Sports playGame(Integer type){
        if(type.compareTo(GamesType.football.getType()) == 0){
            return new Football();
        }else if(type.compareTo(GamesType.basketball.getType()) == 0 ){
            return new Basketball();
        }else if(type.compareTo(GamesType.shuttlecock.getType()) == 0){
            return new Shuttlecock();
        }
        return null;
    }
}
