package com.dharani.arraylist;

public class TestDArrayList {

	public static void main(String[] args) {
		DArrayList list = new DArrayList();
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);
		
		list.printAllElement();
		System.out.println("The size of the list is " + list.Size());
		list.remove(2);
		System.out.println("After Removing elements");
		list.printAllElement();
		System.out.println("The size of the list is " + list.Size());

		
	

	}

}
