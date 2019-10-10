package com.dharani.problems;

public class printAllSubset {

	public static void main(String[] args) {
		
		 int[][] candles = {{1,1},{3,2},{2,2},{4,3}};
        char set[] = {'a', 'b', 'c'}; 
        
      
       printSubsets(candles);

	}
	
	   // Print all subsets of given set[] 
    static void printSubsets(int[][] candles) 
    { 
        int n = candles.length; 
  
        // Run a loop for printing all 2^n 
        // subsets one by obe 
        for (int i = 0; i < (1<<n); i++) 
        { 
            System.out.print("{ "); 
  
            // Print current subset 
            for (int j = 0; j < n; j++) 
  
                // (1<<j) is a number with jth bit 1 
                // so when we 'and' them with the 
                // subset number we get which numbers 
                // are present in the subset and which 
                // are not 
                if ((i & (1 << j)) > 0) 
                    System.out.print( "{ "+ candles[j][0]+ ","+candles[j][1]+ " }"); 
  
            System.out.println("}"); 
        } 
    }
    

}
