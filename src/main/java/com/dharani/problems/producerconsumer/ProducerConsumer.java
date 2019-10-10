package com.dharani.problems.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	private static List<Integer> list = new ArrayList<>();

	private int value = 0;
	
	
	public synchronized void produce() {
		
		while (true) {
			if (!list.isEmpty()) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			value++;
			System.out.println("produced " + value);
			list.add(value);
			notify();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		
	}
	
	public synchronized void consume() {
		
		while (true) {
			if (list.isEmpty()) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("consumed " + list.get(0));
			list.clear();
			notify();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		
	}
	
}
