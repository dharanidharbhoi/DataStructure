package com.dharani.problems;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	         StringBuilder reverse = new StringBuilder() ;
	         char[] word = A.toCharArray();
	         
	         for(int i = word.length-1;i>=0;i--) {
	        	 reverse.append(word[i]);
	         }
	         
	         if(A.equals(reverse.toString())) {
	        	 System.out.println("Yes");
	         }else {
	        	 System.out.println("No");
	         }
	        
	}

}
