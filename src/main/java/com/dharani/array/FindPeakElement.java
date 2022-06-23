package com.dharani.array;


/**
 * 
 * A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.

You must write an algorithm that runs in O(log n) time.
Input: nums = [1,2,3,1]
Output: 2
 *
 */
public class FindPeakElement {

	public static void main(String[] args) {
		
         int[] nums = {1,2};
         
         System.out.println(findPeakElement(nums));

	}

	private static int findPeakElement(int[] nums) {
		
		
		
		
		int start = 0;
		int end = nums.length-1;
		
		while(start <= end) {
			
	int mid = start + (end-start)/2;
			
			
		 if( (mid-1 >= 0 ? nums[mid-1] < nums[mid] : true) && (mid+1 <= nums.length-1 ? nums[mid+1] < nums[mid] : true)) {
			 return mid;
		 }
		 if( mid +1 <= nums.length ? nums[mid+1] > nums[mid] : true) {
			 start = mid +1;
		 }else {
			 end = mid-1;
		 }
			
			
		}
		
		
		
		return -1;
	}



}
