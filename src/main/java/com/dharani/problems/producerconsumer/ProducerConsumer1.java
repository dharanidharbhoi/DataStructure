package com.dharani.problems.producerconsumer;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producer implements Runnable {

	BlockingQueue<Integer> sharedQueue ;
	
	public Producer (BlockingQueue<Integer> sharedQueue ){
		this.sharedQueue = sharedQueue;
	}
	@Override
	public void run() {
		
		for(int i=0;i<11;i++) {
			System.out.println("Prodcued : " + i);
			try {
				sharedQueue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Consumer implements Runnable
{

	BlockingQueue<Integer> sharedQueue ;
	
	public Consumer (BlockingQueue<Integer> sharedQueue ){
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run() {

		while(true) {
			try {
				System.out.println("Consumed : " + sharedQueue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ProducerConsumer1 {
	
	
	public static void main(String[] args) {
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>();
		
		Thread t1 = new Thread(new Producer(sharedQueue), "Producer Queue");
		Thread t2 = new Thread(new Consumer(sharedQueue),"Consumer Queue");
		
		t1.start();
		t2.start();
		
	}
	
	
	

}
