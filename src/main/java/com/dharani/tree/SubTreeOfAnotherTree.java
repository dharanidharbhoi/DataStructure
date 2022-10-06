package com.dharani.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SubTreeOfAnotherTree {

	static TreeNode root;
	
	static TreeNode subRoot;
	
	public static void main(String[] args) {
		
		root = new TreeNode(3);
		root.left = new TreeNode(4);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(2);
		
		subRoot = new TreeNode(4);
		subRoot.left = new TreeNode(1);
		subRoot.right = new TreeNode(2);
		
		
		System.out.println(isSubtree(root, subRoot));

	}
	
	 public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
		 
		 
		   if(root == null && subRoot == null) {
			   return true;
		   }
		   
		   if(subRoot == null) {
			   return false;
		   }
		   
		   Queue<TreeNode> queue = new LinkedList<>();
		   queue.add(root);
		   
		   while(!queue.isEmpty()) {
			   
			   TreeNode node = queue.poll();
			   
			   if(isEqual(node , subRoot)) {
				   return true;
			   }
			   
			   if(node.left != null) queue.offer(node.left);
			   if(node.right != null) queue.offer(node.right);
			   
		   }
		    
		       
		 
		return false;
	        
	    }

	    public static boolean  isEqual(TreeNode root, TreeNode subRoot) {
	        if(root == null && subRoot == null) {
	            return true;
	        }
	        
	        if(root == null || subRoot == null) {
	            return false;
	        }
	        
	        if(root.val != subRoot.val) {
	            return false;
	        }
	        
	        boolean leftSubTree = isEqual(root.left, subRoot.left);
	        boolean rightSubTree = isEqual(root.right, subRoot.right);
	        return leftSubTree && rightSubTree;
	    }


}
