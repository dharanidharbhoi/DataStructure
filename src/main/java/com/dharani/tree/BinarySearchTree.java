package com.dharani.tree;

import java.util.Stack;

public class BinarySearchTree {

	
	Node root ;
	
	public void insert(int value) {
		
		 if(root == null) {
			 root = new Node(value);
			 return ;
		 }
		 
		root = insertNode(root , value);
		
	}

	private Node insertNode(Node node, int value) {
		 if(node == null) {
			 node = new Node(value);
			 return node ;
		 }
		if(node.data > value) {
			node.left = insertNode(node.left, value);
		}else if(node.data < value){
			node.right = insertNode(node.right , value);
		}
	
		return node ;
	}
	
	public void printPreOrderTraversal(){
		printPreOrder(root);
	}
	
	private void printPreOrder(Node node) {
		 
			 System.out.print(node.data + "  ");
		if(node.left != null) {
			printPreOrder(node.left);
		}
		 if(node.right != null) {
			 printPreOrder(node.right);
		  }
		
	}
	
	
	public void printInOrderTraversal() {
		   printInOrder(root);
	}

	private void printInOrder(Node node) {
		
		  if(node.left != null) {
			  printInOrder(node.left);
		  }
		  System.out.print(node.data +" ");
		  if(node.right != null) {
			  printInOrder(node.right);
		  }
	}
	
	



	public void printPostOrderTraversal(){
		printPostOrder(root);
	}

	private void printPostOrder(Node node) {
		if(node.left != null) {
			printPostOrder(node.left);
		}
		if(node.right != null) {
			printPostOrder(node.right);
		}
		System.out.print(node.data +"  ");

	}
	
	public int length() {
		
		int length = 0 ;
		length =  lengthOfTree(root , length);
		
		return length;
	}

	private int lengthOfTree(Node node , int length) {
		if(node == null) {
			return length;
		}
	return	lengthOfTree(node.left, ++length);
		
	}

	public void printInorderTravsersalWithOutRecursion() {
		
		Stack<Node> stack = new Stack<>();
		Node currentNode = root;
		
		while(currentNode != null ||   (stack.size() > 0)) {
			
			while(currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;				
			}
			
			currentNode = stack.pop();
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.right;
			
		}
		
	}


	
	
}
