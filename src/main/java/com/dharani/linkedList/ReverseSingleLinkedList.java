package com.dharani.linkedList;

public class ReverseSingleLinkedList {
	
	  static DNode<String> reverse(DNode<String> head) {
		  
		  if(head == null || head.nextNode == null) {
			  return head;
		  }
		  
		  DNode<String> prevNode = null ;
		  DNode<String> currNode = head ;
		  DNode<String> nextNode = head ;
		  while(currNode.nextNode != null) {
			  nextNode = currNode.nextNode ;
			  currNode.nextNode = prevNode;
			  prevNode = currNode;
			  currNode = nextNode;
			  
		  }
        currNode.nextNode = prevNode;
		head = currNode;
		  
		  
		  
		return head;


	    }

}

