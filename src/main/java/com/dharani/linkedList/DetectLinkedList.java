package com.dharani.linkedList;


class Node {
	
	public Node(int value) {
		this.value = value;
	}

	int value;
	
	Node next;
}

public class DetectLinkedList {
	
	Node head;
	
	public void add(int value) {
		
		if(head == null) {
			head = new Node(value);
		}else {
			addNode(value , head);
		}
		
	}
	  

	private void addNode(int value, Node node) {
		
          if(node.next == null) {
        	  node.next = new Node(value);
          }else {
        	  addNode(value, node.next);
          }
		
	}
	
	public void print(Node node) {
		
		if(node == null) {
			return;
		}
		
		System.out.print(node.value + " ");
		
		print(node.next);
		
	}


	public static void main(String[] args) {
		
		DetectLinkedList dl = new DetectLinkedList();
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.add(4);
		dl.add(5);
		dl.add(6);
        dl.add(7);
        dl.add(8);
        
       // dl.print(dl.head);
        
       // dl.head.next.next.next.next.next.next.next.next = dl.head.next.next;
        dl.detectLoop(dl.head);
		

	}


	private void detectLoop(Node node) {
		
         Node first = node;
         Node second = node.next;
         
         while(second != null && second.next != null) {
        	 
        	 if(first == second) {
        		 System.out.println("Loop Detected");
        		 break;
        	 }
        	 first = first.next;
        	 second = second.next.next;
         }
         
         
         System.out.println("Loop not detected");
		
		
		
	}

}
