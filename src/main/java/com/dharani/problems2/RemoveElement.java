package com.dharani.problems2;

public class RemoveElement {
	
	
    static int removeDuplicates(int arr[]) 
    { 
    	int n = arr.length; 
    	
        if (n == 0 || n == 1) 
            return n; 
       
        int j = 0; 
       

         for(int i=0;i<n;i++) {
        	 
        	 if(arr[i] != arr[j]) {
        		 j++;
        		 arr[j] = arr[i];
        		 
        	 }
        	 
         }
        
       
		return j+1; 
    }
    

	public static void main(String[] args) {
		

        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        
          
        int n = removeDuplicates(arr); 
   
        // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 

	}

}
