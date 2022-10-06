package com.dharani.problems2;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindIndexInArray {
	
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		System.out.println(findIndexOf(12,arr));
	}

	private static int findIndexOf(int value ,int[] arr) {
		
	 for(int i=0,j=arr.length-1;i<=j;i++,j--) {
		 
		 if(arr[i] == value ) {
			 return i;
		 }else if(arr[j]  == value) {
			 return j;
		 }
		 
		 
	 }
	 
	 return -1;
	}

}
