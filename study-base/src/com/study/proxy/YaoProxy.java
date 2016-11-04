/** 
 * Project Name:study-base 
 * File Name:YaoProxy.java 
 * Package Name:com.study.proxy 
 * Date:2016-11-3下午4:40:56 
 * Copyright (c) 2016, zym All Rights Reserved. 
 * 药药好（杭州）网络科技有限公司
*/  
  
package com.study.proxy;  

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;

public class YaoProxy {
	
	private Person per = new Yao();
	
	public Person getProxy(){
		return (Person) Proxy.newProxyInstance(YaoProxy.class.getClassLoader(), per.getClass().getInterfaces(),
				new InvocationHandler(){
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
						if(method.getName().equals("playBasketball")){
							System.out.println("proxy basketball");
							return method.invoke(per, args);
						}
						if(method.getName().equals("playFootball")){
							System.out.println("proxy football");
							return method.invoke(per, args);
						}
						
						return null;
					}
		});
	}

}
  