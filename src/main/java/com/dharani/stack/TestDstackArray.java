package com.dharani.stack;

public class TestDstackArray {

	public static void main(String[] args) {
		DStackArray dstack = new DStackArray() ;
		
		dstack.push(1);
		dstack.push(2);
		dstack.push(3);
		dstack.push(4);
		dstack.push(5);
		dstack.push(6);
		dstack.printAllElements();
		
		System.out.println("The element at the the top of stack is " +dstack.peek());
		System.out.println("The size of the stack is  " +dstack.size);
		
		
		System.out.println("The removed element from the stakc is " + dstack.pop());
		System.out.println("The removed element from the stakc is " + dstack.pop());
		System.out.println("The removed element from the stakc is " + dstack.pop());
		System.out.println("The removed element from the stakc is " + dstack.pop());

		System.out.println("The size of the stack is  " +dstack.size);

	}

}
