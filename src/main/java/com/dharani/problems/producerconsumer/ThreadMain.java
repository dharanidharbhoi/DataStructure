package com.dharani.problems.producerconsumer;

import java.util.LinkedHashSet;
import java.util.Set;

public class ThreadMain {
	
	
	public static void main(String[] args) {

		
		
		
		ProducerConsumer pd = new ProducerConsumer();
		
		Thread t1 = new Thread(() -> pd.produce());
		Thread t2 = new Thread(() -> pd.consume());
		
		t1.start();
		t2.start();
		


		
	}

}
