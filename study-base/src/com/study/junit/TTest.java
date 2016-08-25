/** 
 * Project Name:study-base 
 * File Name:TTest.java 
 * Package Name:com.study.junit 
 * Date:2016-8-25下午1:45:10 
 * Copyright (c) 2016, zym All Rights Reserved. 
 * 药药好（杭州）网络科技有限公司
*/  
  
package com.study.junit;  

import static org.junit.Assert.*;

import org.junit.Test;

public class TTest {

	@Test
	public void testAdd() {
		int s = new T().add(1, 2);
		assertEquals(3, s);
	}

}
  