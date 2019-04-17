package com.dharani.tree;

public class TestTreeTraversal {

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree() ;
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Printing Pre Order Traversal");
		tree.printPreOrderTraversal();
		System.out.println("\n Printing In order Traversal");
		tree.printInOrderTraversal();
		System.out.println("\n Printing Post Order Traversal");
		tree.printPostOrderTraversal();
		System.out.println("\n The length of the tree is " + tree.length());

	}

}
