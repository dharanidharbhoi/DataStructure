package com.dharani.linkedList;

/**
 * This is Normal Linked List where user can add , delete and reverse the node
 * 
 * @author dbhoi
 *
 */
public class DLinkedList<E> {

	DNode<E> startNode;

	public void add(E value) {

		if (startNode == null) {
			startNode = new DNode<>(value, null, null);
			return;
		}

		addNextNode(value, startNode);

	}

	private void addNextNode(E value, DNode<E> node) {

		if (node.nextNode == null) {
			DNode<E> newNode = new DNode<>(value, node, null);
			node.nextNode = newNode;
			return;
		}
		node.prevNode = node;
		node = node.nextNode;
		addNextNode(value, node);

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
