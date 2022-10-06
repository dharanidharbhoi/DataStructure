package com.dharani.sorting;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {
		
		int[] arr = {7,10,5,8,14,20,11};
		
		arr  = insertionSortheArray(arr);
		
		Arrays.stream(arr).forEach(System.out::println);
				

	}

	private static int[] insertionSortheArray(int[] arr) {
		  
		  for(int i=1;i<arr.length;i++) {
			  int key = arr[i];
			  
			  int j = i-1;
			  
			  while(j>=0 && arr[j] > key) {
				  arr[j+1] = arr[j];
				  j--;
			  }
			  arr[j+1] = key;
			  
		  }
		return arr;
	}

}
