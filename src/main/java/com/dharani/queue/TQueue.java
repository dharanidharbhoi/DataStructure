package com.dharani.queue;

public class TQueue<E> {
	
	int size =2 ;
	int top =0;
	Object[] elementArray ;
	
	public TQueue(){
		elementArray = new Object[size];
	}
	
	public void add(E value) {
		 
		    if(size /2 < top) {
		    	increaseSize();
		    }
		    elementArray[top] = value ;
		    top++;
	}

	private void increaseSize() {
		size = size *2 ;
		Object[] copyArray = new Object[size];
		System.arraycopy(elementArray, 0, copyArray, 0, top);
		elementArray = copyArray;
		
	}
	
  public Object poll() {
	    Object returnValue = elementArray[0];
	    Object[] copyArray = new Object[size];
		System.arraycopy(elementArray, 1, copyArray, 0, top);
		elementArray = copyArray;
		top--;
		if(size /3 > top) {
			decreaseSize();
		}
	  
	  return returnValue ;
  }
	
	
	private void decreaseSize() {
		size = size /2 ;
		Object[] copyArray = new Object[size];
		System.arraycopy(elementArray, 0, copyArray, 0, top);
		elementArray = copyArray;
	
}

	public void printAll() {
		for(int i=0;i<top;i++) {
			System.out.println("The elements are " + elementArray[i].toString());
		}
	}

}
