package com.dharani.linkedList;

import java.util.Stack;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * 
 * Output: [7,0,8]
 * 
 * Explanation: 342 + 465 = 807.
 *
 * 
 */



public class AddTwoNumbers {
	


	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
	
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		
		ListNode node = addTwoNumbers(l1, l2);
		
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		

	}
	
	
	  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	
		    ListNode dummy_head = new ListNode(0);
		    ListNode l3 = dummy_head;
		    int carry = 0;
		    
		    while(l1 != null || l2 != null) {
		    	int l1_val = l1 != null ? l1.val : 0;
		    	int l2_val = l2 != null ? l2.val : 0;
		    	int sum = l1_val + l2_val + carry;
		    	carry = sum / 10;
		    	int lastDigit = sum % 10;
		    	
		    	l3.next = new ListNode(lastDigit);
		    	if(l1 != null ) l1 = l1.next;
		    	if(l2 != null ) l2 = l2.next;
		    	l3 = l3.next;
		    	
		    }
		    
		    if(carry > 0) {
		    	l3.next = new ListNode(carry);
		    	l3 = l3.next;
		    }
		    
		    return dummy_head.next;
		  
	    }

}
