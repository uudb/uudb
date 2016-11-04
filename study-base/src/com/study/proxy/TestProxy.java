/** 
 * Project Name:study-base 
 * File Name:TestProxy.java 
 * Package Name:com.study.proxy 
 * Date:2016-11-3下午4:58:21 
 * Copyright (c) 2016, zym All Rights Reserved. 
 * 药药好（杭州）网络科技有限公司
*/  
  
package com.study.proxy;  

public class TestProxy {

	/**  
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param args  void  
	 * @date: 2016-11-3 下午4:58:21   
	 */
	public static void main(String[] args) {
		YaoProxy yao = new YaoProxy();
		
		Person p = yao.getProxy();
		System.out.println(p.playBasketball());
//		System.out.println(p.playFootball());
	}

}
  