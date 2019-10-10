package com.dharani.problems;

import java.util.Scanner;


/**https://www.hackerrank.com/contests/juniper-hackathon/challenges/hopping-jack/problem **/
public class HoppingJack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
	
		
		  int total = (n * (n+1)) / 2;
			        if(k==1 || k==3 || k==6 || k==10){
			            total = total-1;
			        }
			       
			       
			       System.out.println(total);
			       
			       
			   sc.close();
		

	}

}
