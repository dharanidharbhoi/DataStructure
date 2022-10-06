package com.dharani.tree;

public class BinaryTreeMaxiumPathSum {

	
	 TreeNode node;
	
	static int result = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		BinaryTreeMaxiumPathSum bt = new BinaryTreeMaxiumPathSum();
	     bt.node = new TreeNode(-10);
		bt.node.left = new TreeNode(9);
		bt.node.right = new TreeNode(20);
		bt.node.right.left = new TreeNode(15);
		bt.node.right.right = new TreeNode(7);
		
		System.out.println(maxPathSum(bt.node));

		
		
		

	}
	
	
	  public static int maxPathSum(TreeNode root) {
		  
		  
	        if(root == null) {
	        	return 0;
	        }
	  
	      dfs(root);
	  
	  
	  return result;
      
  }

private static int dfs(TreeNode root) {
	
	    if(root == null) {
	    	return 0;
	    }
	    
	 int maxleft = dfs(root.left);
	 int maxright = dfs(root.right);
	 
	 maxleft = Integer.max(maxleft, 0);
	 maxright = Integer.max(maxright, 0);
	 
	 result = Integer.max(result, root.val + maxleft + maxright);
	 
	 return  root.val + Integer.max(maxleft, maxright);
	
	   
	
}
	
	
	
	


}
