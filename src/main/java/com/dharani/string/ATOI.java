package com.dharani.string;

public class ATOI {
	
	
	
	public static void main(String[] args) {
	
		String number = "012546ABCD";
		
		int num = atoi(number);
		System.out.println(num);
	}

	private static int atoi(String number) {
		
		  int result = 0;
		  
		  char[] arr = number.toCharArray();
		  
		  for(char c : arr) {
			  
			  if( c >= '0' && c <= '9') {
				 
				  int i =  c - '0';
				  result = (result * 10) + i ;
				  
			  }
			  
		  }
		
		return result;
	}

}
