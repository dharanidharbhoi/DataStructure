package com.dharani.array;

/**
 * 
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
 *
 */
public class SearchInRotatedArray {

	public static void main(String[] args) {
		
		 int[] nums = {5,1,3};
		 int target = 3;
		 
		 System.out.println(search(nums,target));

	}

	private static int search(int[] nums, int target) {
		
		int end = nums.length-1;
		int l =0;
		int mid ;
		while(l<end) {
			
			if(nums[l] <= nums[end]) {
				break;
			}
		 mid = (l + end)/2;
		 
		 if(nums[mid] >= nums[l]) {
			l = mid+1; 
		 }else {
			 end = mid;
		 }
			
		}
		
      int left = searchSortedArray(nums,0,l-1,target);
      int right = searchSortedArray(nums,l,nums.length-1,target);
      
      return left == -1 ? right : left ;
	}

	private static int searchSortedArray(int[] nums, int start, int end, int target) {
		
		int mid ;
		
		while(start <= end) {
			 mid = (start+end) /2;
			 
			 if(nums[mid] == target) return mid;
			
			 if(nums[mid] > target) {
				 end = mid-1;
			 }else
			 {
				 start = mid+1;
			 }
			
		}
		
		return -1;
	}

}
