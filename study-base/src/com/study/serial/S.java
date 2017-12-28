package com.study.serial;

import java.io.Serializable;

/**
 * @author a
 * 测试父类序列化的情况
 */
public class S extends P implements Serializable {

	private static final long serialVersionUID = 1L;
	private String ss = "2";
	
	public void tt(){
		System.out.println("s：" + ss);
	}
}
