package com.dharani.tree;





public class BinarySearchTreeNew {
	
	Node root;
	
	
	public void addNode(int value) {
		
		if(root == null) {
			root = new Node(value);
		}
	
	   addNodeValue(root,value);
		
	}
	
	private Node addNodeValue(Node node, int value) {
		
		if(node == null) {
			node = new Node(value);
			return node;
		}
		if(node.data > value) {
			node.left = addNodeValue(node.left, value);
		}
		if(node.data < value) {
			node.right = addNodeValue(node.right, value);
		}
		
		return node;
		
	}
	
	
	public void removeNode(int value) {
		removeNode(root,value);
	}

	private void removeNode(Node node, int value) {
		
		if(node == null) {
			return;
		}
		
		if(node.data == value) {
			deleteNode(node);
			return;
		}
		
		if(node.left != null) {
			removeNode(node.left,value);
		}
		if(node.right != null) {
			removeNode(node.right, value);
		}
		
	}

	private void deleteNode(Node node) {
		
		
		
	}

	public void printInOrder(Node node) {
		
		if(node == null) {
			return;
		}
		
		if(node.left != null) {
			printInOrder(node.left);
		}
		System.out.print(node.data + " ");
		if(node.right != null) {
			printInOrder(node.right);
		}
		
		
	}
	
	public boolean  isBST(Node root) {
		if(root == null) {
			return true;
		}
	
		return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	  	
	}

	private boolean isBSTUtil(Node node, int minValue, int maxValue) {

		      if(node == null) {
		    	  return true;
		      }
		
		    if(node.data < minValue || node.data > maxValue ) {
		    	return false;
		    }
		    
		
		
		return isBSTUtil(node.left, minValue, node.data-1) && isBSTUtil(node.right,node.data+1,maxValue);
	}

	public static void main(String[] args) {
		
		BinarySearchTreeNew bt = new BinarySearchTreeNew();
		bt.addNode(22);
		bt.addNode(7);
		bt.addNode(10);
		bt.addNode(1);
		bt.addNode(8);
		bt.addNode(20);
		bt.addNode(50);
		bt.addNode(25);
		bt.addNode(56);
		bt.addNode(30);
		bt.addNode(58);
		bt.addNode(57);
		bt.addNode(100);
		
		bt.printInOrder(bt.root);
		System.out.println();
		System.out.println("Is BT1 BST " + bt.isBST(bt.root));
		
		BinarySearchTreeNew bt2 = new BinarySearchTreeNew();
		bt2.root = new Node(22);
		bt2.root.left = new Node(7);
		bt2.root.left.right = new Node(10);
		
		bt2.root.right = new Node(50);
		bt2.root.right.left = new Node(25);
		bt2.root.right.right = new Node(75);
		bt2.root.right.right.left = new Node(21);
		
		System.out.println("Is BT2 BST " + bt2.isBST(bt2.root));

		
	}

}
