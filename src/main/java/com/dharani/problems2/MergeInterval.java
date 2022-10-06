package com.dharani.problems2;

import java.util.Arrays;
import java.util.Comparator;

public class MergeInterval {

	public static void main(String[] args) {
		
		int[][] intervals = {{1,9},{2,4},{4,7},{6,8}};
		MergeInterval mi = new MergeInterval();

		
		int[][] result = mi.merge(intervals);
		

		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i][0] + " "+result[i][1]);
		}
	}
	
	
    private  int[][] merge(int[][] arr) {
    	
    	
    	int[][] result = new int[arr.length][2];
         
         int index = 0; // Stores index of last element  
         // in output array (modified arr[])  
     
         // Traverse all input Intervals  
         for (int i=1; i<arr.length; i++)  
         {  
             // If this is not first Interval and overlaps  
             // with the previous one  
             if (arr[index][1] >=  arr[i][0])  
             {  
                    // Merge previous and current Intervals  
            	 result[index][1] = Math.max(result[index][1], arr[i][1]);  
            	 result[index][0] = Math.min(result[index][0], arr[i][0]);  
             }  
             else { 
                 index++; 
             }     
         } 
    	
return result;

        
    }

}
