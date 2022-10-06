package com.dharani.array;

/**
 * 
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * A subarray is a contiguous part of an array.
 * 
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 
 * Output: 6
 * 
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 */
public class MaximumSumOfSubarray {

	public static void main(String[] args) {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(maxSubArray(nums));

	}

	public static int maxSubArray(int[] nums) {

		int result = 0;

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int sum = nums[0];
		 result = nums[0];


		for (int i = 1; i < nums.length; i++) {

			sum = Math.max(sum + nums[i], nums[i]);

			result = Math.max(result, sum);

			if (sum < 0) {
				sum = 0;
			}

		}

		return result;

	}

}
