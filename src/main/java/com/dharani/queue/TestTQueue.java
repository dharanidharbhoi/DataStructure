package com.dharani.queue;

public class TestTQueue {

	public static void main(String[] args) {
		
		TQueue<Integer> queue = new TQueue<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.printAll();
		
		System.out.println("the remove element is " + queue.poll().toString());
		System.out.println("the remove element is " + queue.poll().toString());
		queue.printAll();

		
		
		

	}

}
