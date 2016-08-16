/** 
 * Project Name:study-base 
 * File Name:Tree.java 
 * Package Name:com.study.tree 
 * Date:2016-8-16下午4:19:02 
 * Copyright (c) 2016, zym All Rights Reserved. 
 * 药药好（杭州）网络科技有限公司
*/  
  
package com.study.tree;  

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {

	/**  
	 * @Title: firstTree
	 * @Description: 前序遍历   根-左-右 
	 * @param treeType  void  
	 * @date: 2016-8-16 下午4:22:44   
	*/
	public void firstTree(TreeType treeType){
		if(treeType != null){
			System.out.print(treeType.data);
			firstTree(treeType.left);
			firstTree(treeType.right);
		}
	}
	
	/**  
	 * @Title: middleTree
	 * @Description: 中序遍历  左-根-右  
	 * @param treeType  void  
	 * @date: 2016-8-16 下午4:25:43   
	*/
	public void middleTree(TreeType treeType){
		if(treeType != null){
			firstTree(treeType.left);
			System.out.print(treeType.data);
			firstTree(treeType.right);
		}
	}
	
	/**  
	 * @Title: lastTree
	 * @Description: 后序遍历   左-右-根  
	 * @param treeType  void  
	 * @date: 2016-8-16 下午4:26:05   
	*/
	public void lastTree(TreeType treeType){
		if(treeType != null){
			firstTree(treeType.left);
			firstTree(treeType.right);
			System.out.print(treeType.data);
		}
	}
	
	/**  
	 * @Title: levelTree
	 * @Description: 层序遍历(栈操作)  上-下
	 * @param treeType  void  
	 * @date: 2016-8-16 下午4:28:51   
	*/
	public void levelTreeS(TreeType treeType){
		
		Stack<TreeType> s = new Stack<TreeType>();
		
		if(treeType != null){
			s.push(treeType);
		}
		
		TreeType treeType1 = s.remove(0);
		while(treeType1 != null){
			
			System.out.println(treeType1.data);
			
			if(treeType1.left != null){
				s.push(treeType1.left);
			}
			
			if(treeType1.right != null){
				s.push(treeType1.right);
			}
			
			treeType1 = s.remove(0);
		}
		
	}
	
	/**  
	 * @Title: levelTreeQ
	 * @Description: 层序遍历(队列操作)  上-下
	 * @param treeType  void  
	 * @date: 2016-8-16 下午5:17:40   
	*/
	public void levelTreeQ(TreeType treeType){
		Queue<TreeType> q = new LinkedList<TreeType>();
		
		if(treeType != null){
			q.add(treeType);
		}
		
		TreeType treeType1 = q.poll();
		while(treeType1 != null){
			
			System.out.println(treeType1.data);
			
			if(treeType1.left != null){
				q.add(treeType1.left);
			}
			
			if(treeType1.right != null){
				q.add(treeType1.right);
			}
			
			treeType1 = q.poll();
		}
	}
}
  