package com.dharanni.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


class Producer implements  Runnable{
	
	BlockingQueue<Integer> queue;
	
	
	public Producer(BlockingQueue<Integer> queue) {
		
		this.queue = queue;
		
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<20;i++) {
			try {
				System.out.println("produced " + i);
				queue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
		
		
		
	}
}

class Consumer implements  Runnable{
	
	BlockingQueue<Integer> queue;
	
	
	public Consumer(BlockingQueue<Integer> queue) {
		
		this.queue = queue;
		
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("Consumed " + queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class BlockingQueueConsumerProducer {

	public static void main(String[] args) {
		
		
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		
		
       Thread t1 = new Thread(new Producer(queue), "Prodcuer Thread");
       
       Thread t2 = new Thread(new Consumer(queue), "Consumer Thread");

		t1.start();
		t2.start();

	}

}
