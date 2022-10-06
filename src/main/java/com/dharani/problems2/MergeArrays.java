package com.dharani.problems2;

public class MergeArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		
		int n = 3;
		
		merge(nums1,m,nums2,n);

	}
	
	
	 public static  void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		 
          int[] temp = new int[m+n];
          System.arraycopy(nums1, 0, temp, 0, m);
              
               int index = 0;
               int index1 = 0;
               int index2 = 0;
               
               while(index1 < m && index2 < n) {
            	   
            	  if(temp[index1] < nums2[index2]) {
            		  nums1[index] = temp[index1];
            		  index1++;
            	  }else {
            		  nums1[index] = nums2[index2];
            		  index2++;
            	  }
            	  
            	  index++;
            	  
            	   
               }
          
         for(int i= index1;i< m;i++) {
        	 nums1[index] =temp[i];
        	 index++;
         }
         
         for(int i= index2;i< n;i++) {
        	 nums1[index] =nums2[i];
        	 index++;
         }
    

          
          for(int p=0;p<m+n;p++) {
        	  System.out.println(nums1[p]);
          }
	        
	    }

}
