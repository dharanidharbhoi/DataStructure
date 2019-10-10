package com.dharani.linkedList;

public class CircularLinkedList {

	static boolean hasCycle(DNode<Integer> head) {

		if (head == null) {
			return false;
		}

		DNode<Integer> slow = head;
		DNode<Integer> fast = head;

		while (fast != null && fast.nextNode != null) {
			slow = slow.nextNode;
			fast = fast.nextNode.nextNode;

			if (slow == fast) {
				return true;
			}
		}

		return false;

	}

}
