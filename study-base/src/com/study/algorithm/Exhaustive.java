/** 
 * Project Name:study-base 
 * File Name:Exhaustive.java 
 * Package Name:com.study.algorithm 
 * Date:2016-8-17下午3:57:08 
 * Copyright (c) 2016, zym All Rights Reserved. 
 * 
*/  
  
package com.study.algorithm;  

import java.util.Scanner;

import com.study.util.RegxValidate;

/**   
 * @ClassName: Exhaustive   
 * @Description: 穷举法（鸡兔同笼）  
 * @author: zym
 * @date: 2016-8-17 下午3:57:14   
 */ 
public class Exhaustive {
	
	final int rabbit_foot = 4;
	final int chickens_foot = 2;
	
	/**  
	 * @Title: exhau
	 * @Description: 由于兔子为四条腿，鸡为两条腿，因此计算先可能出现兔子的最大量 ，从而减少数据计算量 
	 * @param head
	 * @param foot  void  
	 * @date: 2016-8-17 下午4:13:37   
	*/
	public void exhau(Integer head, Integer foot){
		boolean flag = false;
		int maxSum = foot / rabbit_foot;
		for(int i=0; i<maxSum; i++){    //i-兔子的个数
			int _foot = i * rabbit_foot + (head - i) * chickens_foot;
			if(_foot == foot){
				flag = true;
				System.out.println("兔子：" + i + "只      鸡：" + (head - i) + "只");
			}
		}
		
		if(!flag){
			System.out.println("头脚数据不匹配，请确认");
		}
	}

	/**  
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param args  void  
	 * @date: 2016-8-17 下午3:57:08   
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer head = 0;
		Integer foot = 0;
		boolean flag = false;
		
		do{
			System.out.print("请输入共有多少头:");
			String s = sc.next();
			if(RegxValidate.isNm(s)){
				head = Integer.valueOf(s);
				flag = false;
			}else{
				System.out.println("请输入数字!!!");
				flag = true;
			}
		}while(flag);
		
		flag = false;
		do{
			System.out.print("请输入有多少脚:");
			String s = sc.next();
			if(RegxValidate.isNm(s)){
				foot = Integer.valueOf(s);
				flag = false;
			}else{
				System.out.println("请输入数字!!!");
				flag = true;
			}
		}while(flag);
		
		Exhaustive ex = new Exhaustive();
		ex.exhau(head, foot);
	}

}
  