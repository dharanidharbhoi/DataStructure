package com.dharani.linkedList;

public class MainDLinkedList {

	public static void main(String[] args) {
		
		DLinkedList<Integer> intLinkedList = new DLinkedList<>();
		
		intLinkedList.add(1);
		intLinkedList.add(2);
		intLinkedList.add(3);
		intLinkedList.add(4);
		System.out.println("Length of the List - " + intLinkedList.length);
		intLinkedList.printAllNode();
		System.out.println("After remvoing Top Node");
		intLinkedList.removeTopNode();
		System.out.println("Length of the List - " + intLinkedList.length);
		intLinkedList.printAllNode();
		System.out.println("After reversing the linked List");
		intLinkedList.reverseList();
		intLinkedList.printAllNode();
		System.out.println("Length of the List - " + intLinkedList.length);

	}

}
