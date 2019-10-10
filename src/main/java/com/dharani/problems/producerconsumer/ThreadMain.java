package com.dharani.problems.producerconsumer;

public class ThreadMain {
	
	
	public static void main(String[] args) {
		ProducerConsumer pc = new ProducerConsumer();
		
		Thread thread1 = new Thread(() -> {
			pc.produce();
		});
		
		Thread thread2 = new Thread(() -> {
			pc.consume();
		});
		thread1.run();
		thread2.run();
		
	}

}
