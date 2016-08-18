/** 
 * Project Name:study-base 
 * File Name:Divide.java 
 * Package Name:com.study.algorithm 
 * Date:2016-8-18下午2:24:54 
 * Copyright (c) 2016, zym All Rights Reserved. 
 * 
*/  
  
package com.study.algorithm;  

import java.util.Scanner;

import com.study.util.RegxValidate;

/**   
 * @ClassName: Divide   
 * @Description: 分治算法（真假硬币）   （将一个问题分成若干个子问题进行解决）
 * @author: zym
 * @date: 2016-8-18 下午2:25:08   
 */ 
public class Divide {
	
	/**  
	 * @Title: divideA
	 * @Description: 查找硬币的真假，假硬币要比真硬币轻 
	 * @param coinSum 硬币总个数
	 * @param start 起始位置
	 * @param end  void  结束位置
	 * @date: 2016-8-18 下午2:34:00   
	*/
	public void divideA(int[] coinSum,int start, int end){
		if(coinSum.length == 0){
			System.out.println("没有假硬币");
		}else if(start == end){
			System.out.println("假硬币的位置为：" + start);
		}else{
			int wei = (end - start + 1) / 2 + start;    //计算中间位置
			int yu = (end - start + 1) % 2;
			
			int _fontSum = 0;
			int _backSum = 0;
			for(int i = start ; i < wei; i++){     //取前半区值（如果为奇数，则不包含最中间位置数据）
				_fontSum = _fontSum + coinSum[i];
			}
			
			for(int j = wei + yu; j <= end; j++){      //取后半区值（如果为奇数，则不包含最中间位置数据）
				_backSum = _backSum + coinSum[j];
			}
			
			if(_fontSum == _backSum ){
				if(yu == 0){
					System.out.println("没有假硬币");
				}else{
					System.out.println("假硬币的位置为：" + wei);
				}
			}else if(_fontSum < _backSum){
				divideA(coinSum, start, wei - 1 + yu);
			}else if(_fontSum > _backSum){
				divideA(coinSum, wei, end);
			}
			
		}
		
		
	}

	/**  
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param args  void  
	 * @date: 2016-8-18 下午2:24:54   
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer coinTotal = 0;
		boolean flag = false;
		boolean having_false_coin = false;   //true-有假币，false-没有假币
		
		do{
			System.out.print("请输入硬币总数:");
			String s = sc.next();
			if(RegxValidate.isNm(s)){
				coinTotal = Integer.valueOf(s);
				if(coinTotal <= 2){
					System.out.println("硬币数据量太少，无法分析");
					flag = true;
				}else{
					flag = false;
				}
			}else{
				System.out.println("请输入数字!!!");
				flag = true;
			}
		}while(flag);
		
		int[] coinSum = new int[coinTotal];
		
		for(int i=0 ; i<coinTotal ; i++){
			flag = false;
			do{
				System.out.print("请输入硬币真假（0-假，1-真）:");
				String s = sc.next();
				if("0".equals(s)){
					if(having_false_coin){
						System.out.print("假币只能有一枚");
						flag = true;
					}else{
						having_false_coin = true;
						flag = false;
					}
				}else if("1".equals(s)){
					coinSum[i] = Integer.valueOf(s);
					flag = false;
				}else{
					System.out.println("请输入（0/1）!!!");
					flag = true;
				}
			}while(flag);
		}
		
		Divide di = new Divide();
		di.divideA(coinSum, 0, coinTotal - 1);
	}

}
  