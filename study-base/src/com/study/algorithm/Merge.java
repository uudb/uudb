/** 
 * Project Name:study-base 
 * File Name:Merge.java 
 * Package Name:com.study.algorithm 
 * Date:2016-8-23下午4:16:46 
 * Copyright (c) 2016, zym All Rights Reserved. 
*/  
  
package com.study.algorithm;  

/**   
 * @ClassName: Merge   
 * @Description: 合并排序法
 * @author: zym
 * @date: 2016-8-23 下午4:16:56   
 */ 
public class Merge {
	
	static final int SIZE = 17;

	/**  
	 * @Title: mergeOne
	 * @Description: 指定步长数据排序  
	 * @param sou
	 * @param tar
	 * @param n
	 * @param len  void  
	 * @date: 2016-8-23 下午5:35:34   
	*/
	public void mergeOne(int[] sou, int[] tar, int n, int len){
		int i,j,k,s,e;
		
		s = 0;
		while(s + len < n){
			e = s + 2 * len -1;     //有序数组的结束座标
			if(e >= n){       //最后一段数据小于步长
				e = n - 1;
			}
			
			//相邻有序段合并
			k = s;
			i = s;
			j = s + len;
			
			while(i < s + len && j <= e){   //两个有序表都未结束时，循环比较
				if(sou[i] <= sou[j]){     //较小的元素合并到目标数组
					tar[k++] = sou[i++];
				}else{
					tar[k++] = sou[j++];
				}
			}
			
			while(i < s + len){
				tar[k++] = sou[i++];      //未合并部分合并到目标数组
			}
			
			while(j <= e){
				tar[k++] = sou[j++];     //未合并部分合并到目标数组
			}
			
			s = e + 1;    //下一段有序数组的座标
		}
		
		if(s < n){       //将剩余的一个有序段从源数组复制到目标数组中
			for(;s < n; s++){
				tar[s] = sou[s];
			}
		}
	}

	/**  
	 * @Title: mergeSort
	 * @Description: 按固定步长的相邻两数据排序比较  
	 * @param sou
	 * @param n  void  
	 * @date: 2016-8-23 下午5:33:45   
	*/
	public void mergeSort(int[] sou, int n){
		int h,count,len,f;
		count = 0;     //排序步骤
		len = 1;     //有序序列步长
		f = 0;      //
		
		int[] tar = new int[n];
		while (len < n){
			if(f == 1){        //交替源数组、目标数组数据
				this.mergeOne(tar, sou, n, len);    //将目标数据合并至源数据
			}else{
				this.mergeOne(sou, tar, n, len);   //将源数据合并至目标数据
			}
			
			len = len * 2;     //增加有序序列长度
			f = 1 - f;        //切换f值（0/1）
			
			count++;
			
			System.out.print("第" + count + "步排序结果:");   //输出排序后结果
			for(h = 0; h < SIZE; h++){
				System.out.print(" " + sou[h]);
			}
			System.out.println();
		}
		
		if(f == 1){    
			for(h = 0; h < n; h++){     //将目标数组中的数据复制回源数组
				sou[h] = tar[h];
			}
		}
	}
	/**  
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param args  void  
	 * @date: 2016-8-23 下午4:16:46   
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
		
		Merge mer = new Merge();
		mer.mergeSort(shuzu, SIZE);
		
		System.out.print("排序后数组序列为：");
		for(i=0; i<SIZE; i++){
			System.out.print(shuzu[i] + " ");
		}
		
	}

}
  