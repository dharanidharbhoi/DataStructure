package com.dharani.stack;

public class TestDStackLinked {

	public static void main(String[] args) {
		DStackLinked<Integer> stackLinked = new DStackLinked<>();
		stackLinked.push(1);
		stackLinked.push(2);
		stackLinked.push(3);
		stackLinked.push(4);
		stackLinked.push(5);
		stackLinked.push(6);
		stackLinked.printAll();
		
		System.out.println("The Top element of the stack is " + stackLinked.peek());
		System.out.println("The poped element of the stack is " + stackLinked.pop());		
		System.out.println("The Top element of the stack is " + stackLinked.peek());
		stackLinked.printAll();

	}

}
