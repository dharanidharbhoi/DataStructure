package com.dharani.linkedList;

/**
 * This is Normal Linked List where user can add , delete and reverse the node
 * 
 * @author dbhoi
 *
 */
public class DLinkedList<E> {

	DNode<E> startNode;
	int length;

	public void add(E value) {
    
		if (startNode == null) {
			startNode = new DNode<>(value, null, null);
			length++;
			return;
		}

		addNextNode(value, startNode);

	}

	private void addNextNode(E value, DNode<E> currentNode) {
             
		if (currentNode.nextNode == null) {
			DNode<E> newNode = new DNode<>(value, currentNode, null);
			currentNode.nextNode = newNode;
			length++;
			return;
		}
	
		addNextNode(value, currentNode.nextNode);

	}

	public void removeTopNode() {
		removeNode(startNode);
	}

	private void removeNode(DNode<E> node) {
		if (node.nextNode == null) {
			node.prevNode.nextNode = null;
			length--;
			return;
		}
		removeNode(node.nextNode);
	}

	public void reverseList() {
		reverse(startNode);
	}

	private void reverse(DNode<E> node) {
		DNode<E> prevNode = node.prevNode;
		DNode<E> nextNode = node.nextNode;
	

		if (node.nextNode == null) {
			node.nextNode = prevNode ;
			startNode = node;
			return;

		}
		node.nextNode = prevNode;
		node.prevNode = nextNode;
		reverse(nextNode);

	}

	public void printAllNode() {
		printNode(startNode);
	}

	private void printNode(DNode<E> node) {

		if (node.nextNode == null) {
			System.out.println("Node value is - " + node.value);
			return;
		}
		System.out.println("Node value is - " + node.value);
		printNode(node.nextNode);

	}

}
