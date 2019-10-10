package com.dharani.problems;

public class Fibonacci {

	static  int fibmem[];
	
	public static void main(String[] args) {
		fibmem = new int [10];
		System.out.println(fib(10));
		

	}

	private static int printFiboNacci(int n) {
		
		int result = 1;
		if(n > 2) {
			result = printFiboNacci(n-1) + printFiboNacci(n-2);
		}
		
		return result ;
		
	}
	
	 private static int fib(int n) 
	  { 
	    int f[] = new int[n+1]; 
	    f[0] = 0; 
	    f[1] = 1; 
	    for (int i = 2; i <= n; i++) 
	          f[i] = f[i-1] + f[i-2]; 
	    return f[n]; 
	  } 
	
	

}
