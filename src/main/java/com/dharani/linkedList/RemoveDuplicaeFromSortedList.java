package com.dharani.linkedList;



/**
 * 
 * Given the head of a sorted linked list, delete all nodes that have duplicate
 * numbers, leaving only distinct numbers from the original list. Return the
 * linked list sorted as well. Input: head = [1,2,3,3,4,4,5] Output: [1,2,5]
 *
 */
class ListNode{
   int val;
   ListNode next;
   
   public ListNode(int value) {
	 this.val = value;
	 this.next = null;
}
}

public class RemoveDuplicaeFromSortedList {

	ListNode head;
	
	public static void main(String[] args) {

		RemoveDuplicaeFromSortedList st = new RemoveDuplicaeFromSortedList();
		st.head = new ListNode(1);
		st.head.next = new ListNode(1);
		st.head.next.next = new ListNode(1);
		st.head.next.next.next= new ListNode(3);
		st.head.next.next.next.next = new ListNode(4);
		st.head.next.next.next.next.next = new ListNode(4);
		st.head.next.next.next.next.next.next = new ListNode(5);
		
		printList(st.head);
		System.out.println();
		ListNode node = deleteDuplicates(st.head);
		printList(node);
		
		
	}
	
	 private static void printList(ListNode node) {
		
		 while(node != null) {
			 System.out.print(node.val +  " ");
			 node = node.next;
		 }
		
	}

	public static ListNode deleteDuplicates1(ListNode head) {
		
		    if(head == null || head.next == null) {
		    	return head;
		    }
	      
	      //  ListNode nextNode = head.next;
	         
	        boolean duplicate = false;
	        
	       while(head.next != null && head.val == head.next.val) {
	    	   head = head.next;
	    	   duplicate = true;
	       }
	       
	       
	       if(duplicate) return deleteDuplicates1(head.next);
	       
	       head.next = deleteDuplicates1(head.next);
		 
		 return head;
	    }
	
	
	  public static ListNode deleteDuplicates(ListNode head) {
	        if(head == null || head.next == null) return head;
	        boolean dup = false;
	        while(head.next!=null && head.val == head.next.val){
	            dup = true;
	            head = head.next;
	        }
	        if(dup) return deleteDuplicates(head.next);
	        head.next = deleteDuplicates(head.next);
	        return head;
	    }

}
