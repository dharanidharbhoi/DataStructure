package com.dharani.tree;

public class FlattenInOrderTree {

	 private Node root;
	
	public static void main(String[] args) {
		
	FlattenInOrderTree ft = new FlattenInOrderTree();	
		 ft.root = new Node(5);
		ft.root.left = new Node(3);
		ft.root.left.left = new Node(2);
		ft.root.left.right = new Node(4);
		
	   ft.root.right = new Node(7);
	   ft.root.right.left =new Node(6);
	   ft.root.right.right = new Node(8);
	   
	   
	    flattenNode(ft.root);
	    
	    printNode(ft.root);

	}

	private static void printNode(Node node) {
		
		if(node == null) {
			return;
		}
		
		System.out.println(node.data);
		printNode(node.right);
		
	}

	private static void flattenNode(Node node) {
		
		  if(node == null) {
			  return ;
		  }
		  
		  if(node.left == null &&node.right == null) {
			  return ;
		  }
		  
		  if(node.left != null) {
			  
			  flattenNode(node.left);
			  
			  Node tempNode = node.right;
			  node.right = node.left;
			  node.left = null;
			  
			  
			  //go to the end of the cue
			  Node curr = node.right;
			  while(curr.right != null) {
				  curr = curr.right;
			  }
			  
			  curr.right = tempNode;
			  
		  }
		  
		  flattenNode(node.right);
		  
		
	}

}
