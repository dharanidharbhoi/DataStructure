package com.dharani.array;

public class SumOfSubArrayZero {

	
	
	public static void main(String[] args) {
		int[] arr = {1,7,-4,3,-6,2,-2};
		
		
		printAllTheSubstring(arr);
	}

	private static void printAllTheSubstring(int[] arr) {
		
		 for(int i=0;i<arr.length;i++) {
			   String sub = "" + arr[i];
			   System.out.println(sub);
			 for(int j=i+1;j<arr.length;j++) {
				 
				 sub += arr[j];
				 System.out.println(sub);
			 }
			 
		 }
		
	}
}
