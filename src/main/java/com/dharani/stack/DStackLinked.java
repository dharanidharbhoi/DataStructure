package com.dharani.stack;

public class DStackLinked<E> {

	Node<E> topNode;

	private class Node<E> {
		E value;
		Node<E> prev;

		public Node(E value, Node<E> prev) {
			super();
			this.value = value;
			this.prev = prev;
		}

	}

	public void push(E value) {
		topNode = new Node<>(value, topNode);
	}

	public E peek() {

		if (topNode == null) {
			System.out.println("stack is empty");
			return null;
		}

		return topNode.value;
	}

	public E pop() {
		if (topNode == null) {
			System.out.println("stack is empty");
			return null;
		}
		E returnValue = topNode.value;
		topNode = topNode.prev;

		return returnValue;

	}

	public void printAll() {

		if (topNode == null) {
			System.out.println("stack is empty");
		}

		Node<E> temp = topNode;

		while (temp != null) {
			System.out.println("The element is " + temp.value);
			temp = temp.prev;
		}

	}

}
