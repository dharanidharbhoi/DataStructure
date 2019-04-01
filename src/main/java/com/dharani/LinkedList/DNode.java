package com.dharani.LinkedList;

public class DNode<E> {

	E value;
	DNode<E> prevNode;
	DNode<E> nextNode;
	
	
	public DNode(E value, DNode<E> prevNode, DNode<E> nextNode) {
		super();
		this.value = value;
		this.prevNode = prevNode;
		this.nextNode = nextNode;
	}
	
	


}
