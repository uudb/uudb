package com.study.design.instance;

/**
 * Project Name: uudb
 * Package Name: com.study.design.instance
 * date:  2020/11/23-14:33
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class OpenDoor {

    private static OpenDoor instance;

    private OpenDoor(){};

    public static OpenDoor getInstance(){
        if(instance == null){
            synchronized (OpenDoor.class){
                if(instance == null){
                    instance = new OpenDoor();
                }
            }
        }

        return instance;
    }

    public void open(){
        System.out.println("open door");
    }
}
