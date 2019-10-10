package com.dharani.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TEST1 {
	
	  public static void  maxSubstring(String s) {
		    // Write your code here
		     // Pick starting point 
		  
		    List<String> wordList = new ArrayList<>();
		      
		        char[] str = s.toCharArray();
		        int n = s.length();
		        for (int len = 1; len <= n; len++) { 
		        
		            for (int i = 0; i <= n - len; i++) { 
		             
		                int j = i + len - 1; 
		                StringBuilder sb = new StringBuilder();
		                for (int k = i; k <= j; k++) { 
		                    sb.append(str[k]);
		                } 
		                wordList.add(sb.toString());
		            } 
		        } 
		        
		        Collections.sort(wordList);
		        System.out.println((wordList.get(wordList.size()-1)));

		    }

		

	public static void main(String[] args) {
		
	//	maxSubstring("baca");
		
		 int i=0,j=0,n=6;
	        for(i=0; i<n; i++)
	        {
	         
	            for(j=0; j<(n+i); j++)
	            {
	               if(j<n-i-1)
	                    System.out.print(" ");
	                else
	                {
	                    System.out.print("*");
	                 
	                }
	            }
	            System.out.println(" ");
	        }
	    }
	}


