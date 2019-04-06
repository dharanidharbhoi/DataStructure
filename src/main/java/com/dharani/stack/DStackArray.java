package com.dharani.stack;

public class DStackArray {
	int size = 2;
	int top = 0;
	int stackArray[];
	int length = 2;

	public DStackArray() {
		stackArray = new int[size];

	}

	public void push(int value) {

		if (size / 2 < top) {
			increaseArray();
		}
		stackArray[top] = value;
		top++;
	}

	private void increaseArray() {
		size = size * 2;
		int newArray[] = new int[size];
		for (int i = 0; i < top; i++) {
			newArray[i] = stackArray[i];
		}

		stackArray = newArray;
	}

	public int peek() {
		return stackArray[top - 1];
	}

	public int pop() {
		top--;
		int reutrnValue = stackArray[top];
		stackArray[top] = 0;

		if (size / 2 > top) {
			descreaseArray();
		}
		return reutrnValue;
	}

	private void descreaseArray() {
		size = size / 2;
		int newArray[] = new int[size];
		for (int i = 0; i < top; i++) {
			newArray[i] = stackArray[i];
		}

		stackArray = newArray;

	}

	public void printAllElements() {
		for (int i = 0; i < top; i++) {
			System.out.println("The element is " + stackArray[i]);
		}

	}
}
