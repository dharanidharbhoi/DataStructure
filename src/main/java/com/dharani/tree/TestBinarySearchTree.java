package com.dharani.tree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
          BinarySearchTree bst = new BinarySearchTree();
          bst.insert(8);
          bst.insert(3);
          bst.insert(1);
          bst.insert(6);
          bst.insert(7);
          bst.insert(4);
          bst.insert(10);
          bst.insert(14);
          bst.insert(16);
          System.out.println("Print BST in Inorder");
          bst.printInOrderTraversal();
          System.out.println("Print BST in preOrder");
          
          
	}

}
