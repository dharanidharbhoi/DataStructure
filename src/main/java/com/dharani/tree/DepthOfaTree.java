package com.dharani.tree;

public class DepthOfaTree {

	 static Node root ;
	
	
	public static void main(String[] args) {
		
		root = new Node(6);
		root.left = new Node(2);
		root.right = new Node(14);
		root.right.left = new Node(13);
		root.right.right = new Node(19);
		root.right.right.left = new Node(15);
		
		
		System.out.println("The depth of the tree is  " + heightOfTree(root));

	}


	private static int heightOfTree(Node root) {
		
		      if(root == null) {
		    	  return 0;
		    	  
		      }
		   
		   
		    int left = 	 1 + heightOfTree(root.left);
		     int right = 1 + heightOfTree(root.right);
		      
		
		return left > right ? left : right;
	}

}
