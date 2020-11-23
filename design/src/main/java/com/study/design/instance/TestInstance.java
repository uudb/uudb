package com.study.design.instance;

/**
 * Project Name: uudb
 * Package Name: com.study.design.instance
 * date:  2020/11/23-14:52
 * Copyright (c) 2020, zhengyamin All Rights Reserved.
 * 北京亿点汇通网络科技有限公司
 * Description:(这里用一句话描述这个类的作用)
 */
public class TestInstance {

    public static void main(String[] args){
        OpenDoor.getInstance().open();

        OpenDoorHigh.getInstance().open();
    }
}
