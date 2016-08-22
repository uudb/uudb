/** 
 * Project Name:study-base 
 * File Name:ShellSort.java 
 * Package Name:com.study.algorithm 
 * Date:2016-8-22下午2:34:33 
 * Copyright (c) 2016, zym All Rights Reserved. 
*/  
  
package com.study.algorithm;  

/**   
 * @ClassName: ShellSort   
 * @Description: shell排序法   
 * @author: zym
 * @date: 2016-8-22 下午2:34:37   
 */ 
public class ShellSort {
	
	static final int SIZE = 10;

	public void sort(int[] shuzu){
		int i,j;
		int r,temp;
		int x = 0;
		for(r = shuzu.length/2 ; r>=1; r/=2){  //将数据分组，直至步长为1时结束
			for(i = r; i<shuzu.length; i++){
				temp = shuzu[i];
				j = i - r;
				//取两组序列相对应的数，如果数据需要交换，则交换，如果前一组序列前仍有相对应的序列，则取相对应的数据（即步长为r的数据）继续比较，直至比较至没有相应序列，或数据不需交换为止
				while(j>=0 && temp<shuzu[j]){   
					shuzu[j+r] = shuzu[j];
					j-=r;
				}
				shuzu[j+r] = temp;
			}
			
			x++;
			System.out.print("第" + x + "次排序结果：");
			for(i=0; i<SIZE; i++){
				System.out.print(shuzu[i] + " ");
			}
			System.out.println();
		}
	}
	
	/**  
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param args  void  
	 * @date: 2016-8-22 下午2:34:33   
	 */
	public static void main(String[] args) {
		int[] shuzu = new int[SIZE];
		int i;
		System.out.print("排序前数组序列为：");
		for(i=0; i<SIZE; i++){
			shuzu[i] = (int) (100+Math.random() * (100 + 1));
			System.out.print(shuzu[i] + " ");
		}
		System.out.println();
		
		ShellSort ss = new ShellSort();
		ss.sort(shuzu);
		
		System.out.print("排序后数组序列为：");
		for(i=0; i<SIZE; i++){
			System.out.print(shuzu[i] + " ");
		}
	}

}
  