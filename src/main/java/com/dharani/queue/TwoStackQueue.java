package com.dharani.queue;

import java.util.Stack;


public class TwoStackQueue {
	
	
	Stack<Integer> firstStack = new Stack<>();
	Stack<Integer> secondStack = new Stack<>();
	
	
	public void push(Integer value) {
		
		
		while(!firstStack.isEmpty()) {
			secondStack.add(firstStack.pop());
		}
	
		firstStack.push(value);
		
		while(!secondStack.isEmpty()) {
			
			firstStack.add(secondStack.pop());
		}
		
		
		
		
		
	}
	
	public Integer pop() {
		
		return firstStack.pop();
	}

	public static void main(String[] args) {
		
		TwoStackQueue tsq = new TwoStackQueue();
		tsq.push(1);
		tsq.push(2);
		System.out.println("First Element is " + tsq.pop());
		tsq.push(3);
		tsq.push(4);
		System.out.println("Second Eleemnt is " + tsq.pop());
		System.out.println("Third Eleemnt is " + tsq.pop());


		
	}

}
