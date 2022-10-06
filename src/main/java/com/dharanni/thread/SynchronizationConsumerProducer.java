package com.dharanni.thread;

import java.util.ArrayList;
import java.util.List;

import com.dharani.problems.producerconsumer.ProducerConsumer;

class ConsumerProducer{
	
	
	List<Integer> list = new ArrayList<Integer>();
	int value  = 0;
	
	public synchronized void  produce()  {
		
		
		while(value < 20) {
			
			
			if(!list.isEmpty()) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		  value++;
		  System.out.println("Produced " + value);
		  list.add(value);
		  notify();
		  try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}
		
	}
	
   public synchronized void consume() {
	   
	   while(value < 20) {
		   
		   if(list.isEmpty()) {
			   try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
		   
		   System.out.println("Consumed " + list.get(0));
		   list.clear();
		   notify();
		   
		   try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   
	   }

   }
}


public class SynchronizationConsumerProducer {

	public static void main(String[] args) {
		
		ConsumerProducer cs = new ConsumerProducer();
		
		Thread t1 = new Thread(()->{
			cs.produce();
		});
		
		Thread t2 = new Thread(() ->{
			cs.consume();
		});
		
		t1.start();
		t2.start();
		

	}

}
