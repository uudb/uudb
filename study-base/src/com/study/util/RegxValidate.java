/** 
 * Project Name:study-base 
 * File Name:RegxValidate.java 
 * Package Name:com.study.util 
 * Date:2016-8-17下午4:02:29 
 * Copyright (c) 2016, zym All Rights Reserved. 
 * 
*/  
  
package com.study.util;  

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**   
 * @ClassName: RegxValidate   
 * @Description: 正则表达式  
 * @author: zym
 * @date: 2016-8-17 下午4:02:37   
 */ 
@SuppressWarnings("unused")
public class RegxValidate {

	//纯数字
	private static String nmRegu = "[^0-9]+";
		
	//含有数字
	private static String nmRegu_1 = "([0-9]+)";
		
	//纯字母
	private static String chRegu = "[^A-Za-z]+";
		
	//含有字母
	private static String chRegu_1 = "([A-Za-z]+)";
		
	//汉字
	private static String ccRegu = "^([\\u4E00-\\u9FA5])*$";
		
	//汉字
	private static String ccRegu_1 = "[\\u4E00-\\u9FA5]";
		
	//纯符号
	private static String spRegu = "[^~!@#$%^&\\*\\(\\)_\\+\\-\\=\\{\\}\\[\\]\\?\\/,\\.]+";
	//含有字符
	private static String spRegu_1 = "([~!@#$%^&\\*\\(\\)_\\+\\-\\=\\{\\}\\[\\]\\?\\/,\\.]+)";
		
	//固定电话 7-18位数字，可以包含-
	private static String telephoneRegu = "^[0-9,\\-]{7,18}$";
		
	//手机号码规则 以1开头的十一位数字
	private static String mobilePhoneRegu = "^1[0-9]{10}$";
		
	//地址信息  地址只支持输入# - _（） , 、字符
	private static String addressRegu = "^([\\u4E00-\\u9FA5]|[a-zA-Z0-9]|[#\\-\\_\\(\\) ，,、])*$";
		
	/**
	 * 正则表达式校验
	 * @param para 需要校验证的字符串
	 * @param regx 正则表达式
	 * @return true-符合校验规则，false-不符合校验规则
	 */
	private static boolean regxMsg(String para, String regx){
		Pattern p=Pattern.compile(regx);
		Matcher result=p.matcher(para);
		return result.find();
	}
	
	/**  
	 * @Title: isNm
	 * @Description: 验证给定的字符串是否纯数字 
	 * @param str
	 * @return  String  true-纯数字 
	 * @date: 2015-10-18 下午7:11:56   
	*/
	public static boolean isNm(String str){
		return !regxMsg(str, nmRegu);
	}
	
	/**  
	 * @Title: isSeq
	 * @Description: 是否连续字符验证 
	 * @param para
	 * @return  boolean  true-是连续字符串   false-不是连续字符串
	 * @date: 2015-11-14 下午3:31:18   
	*/
	public static boolean isSeq(String para){
		 char pre = para.charAt(0);
		 String flag = "+";
		 for(int i = 1 ; i<para.length(); i++){
		 	  char aa = para.charAt(i);
		 		if (i == 1 && aa < pre){
		 			flag = "-";
		 		}
		 		
		 		if(flag == "+"){    //正序
		 			if(pre + 1 != aa){	 				 
		 				 return false;
		 			}
		 		}else{  //倒序
		 			if(pre - 1 != aa){
		 				 return false;
		 			}
		 		}	 		
		 		pre = aa;
		 	}	
		 	return true;
	}
	
	/**  
	 * @Title: getLen
	 * @Description: 获取字符串长度，其中汉字按两个字符进行计算
	 * @param str 
	 * @return  int  字符串长度
	 * @date: 2016-2-23 下午2:57:23   
	*/
	public static int getStrLen(String str){
		 Pattern   p   =   Pattern.compile(ccRegu_1);        
	     Matcher   m   =   p.matcher(str);   
	     String s = m.replaceAll("**");
	     return s.length();
	}
}
  