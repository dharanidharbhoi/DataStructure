package com.dharani.arraylist;

public class DArrayList {

	int size = 2;
	int defaultArray[];
	int top = 0;

	public DArrayList() {
		defaultArray = new int[size];
	}

	public void add(int value) {

		if (size / 2 < top) {
			increaseSize();
		}
		defaultArray[top] = value;
		top++;

	}

	private void increaseSize() {
		size = size * 2;
		int copyArray[] = new int[size];
		for (int i = 0; i < top; i++) {
			copyArray[i] = defaultArray[i];
		}
		defaultArray = copyArray;
	}

	public void remove(int index) {

		if (index < 0 || index >= top) {
			return;
		}
		for (int i = index; i < top; i++) {
			defaultArray[i] = defaultArray[i + 1];
		}
		top--;
		if (size / 3 > top) {
			decreaseSize();
		}

	}

	private void decreaseSize() {
		size = size / 2;
		int copyArray[] = new int[size];
		for (int i = 0; i < top; i++) {
			copyArray[i] = defaultArray[i];
		}
		defaultArray = copyArray;

	}
	
	
	public void printAllElement() {
		for(int i=0;i<top;i++) {
			System.out.println("The element is " + defaultArray[i]);
		}
	}
	
	public int Size() {
		return top;
	}

}
