package com.dharani.stack;

import java.util.Stack;

public class MinStack {
	
	
	private Stack<Integer> mainStack =new Stack<>();
	private Stack<Integer> minStack = new Stack<>();
	
	
	void push(int value) {
		
		mainStack.push(value);
		if(minStack.isEmpty()) {
			minStack.add(value);
		}else {
			minStack.add(Math.min(minStack.peek(), value));
		}
	}
	
	private int pop() {
		minStack.pop();
		return mainStack.pop();
		
	}
	
	private int minValue() {
		return minStack.peek();
	}
	
	
 
	public static void main(String[] args) {

		
		MinStack stack = new MinStack();
		stack.push(5);
		stack.push(3);
		stack.push(4);
		stack.push(2);
		stack.push(8);
		stack.push(9);
		
		System.out.println("minimum value of the stack is " + stack.minValue());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Minim value after popping 2 from the system " + stack.minValue());
	}

}
