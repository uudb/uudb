package com.study.serial;

import java.io.Serializable;

public class P implements Serializable{

	private static final long serialVersionUID = 1L;
	private String s;
	
	public void pp(){
		System.out.println("p：" + s);
	}
	
	public void setS(){
		s = "1";
	}
}
