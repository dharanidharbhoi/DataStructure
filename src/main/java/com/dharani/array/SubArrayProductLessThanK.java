package com.dharani.array;

public class SubArrayProductLessThanK {

	public static void main(String[] args) {
		int[] nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
		int k = 19;

		System.out.println(numSubarrayProductLessThanK(nums, k));

	}

	public static int numSubarrayProductLessThanK(int[] nums, int k) {

		int result = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < k) {
				result++;
			}
			int res = nums[i];
			for (int j = i + 1; j < nums.length; j++) {

				res = res * nums[j];
				if (res < k) {
					result++;
				}else {
					break;
				}

			}

		}

		return result;
	}

}
