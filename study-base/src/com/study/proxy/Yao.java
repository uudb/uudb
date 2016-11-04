/** 
 * Project Name:study-base 
 * File Name:Yao.java 
 * Package Name:com.study.proxy 
 * Date:2016-11-3下午4:34:46 
 * Copyright (c) 2016, zym All Rights Reserved. 
 * 药药好（杭州）网络科技有限公司
*/  
  
package com.study.proxy;  

public class Yao implements Person {

	@Override
	public String playBasketball() {
		System.out.println("yao kan play basketball");
		return "bye basketball";
	}

	@Override
	public String playFootball() {
		System.out.println("yao kan play football");
		return "bye football";
	}

}
  