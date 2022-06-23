package com.dharani.array;

/**
 * 
 * 34. Find First and Last Position of Element in Sorted Array
 * 
 * Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value.
 * 
 * If target is not found in the array, return [-1, -1].
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4] Example 2:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1] Example 3:
 * 
 * Input: nums = [], target = 0 Output: [-1,-1]
 *
 */
public class FindFirstAndLastElement {

	public static void main(String[] args) {

		int[] nums = { 5, 7, 7, 8, 8, 10 };

		int[] res = searchRange(nums, 10);
		System.out.println(res[0] + " " + res[1]);

	}

	private static int[] searchRange(int[] nums, int target) {

		int startPos = -1;

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (nums[mid] == target) {
				startPos = mid;
				end = mid - 1;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		if (startPos == -1) {
			return new int[] { -1, -1 };
		}

		start = 0;
		end = nums.length - 1;
		int endPos = -1;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (nums[mid] == target) {
				endPos = mid;
				start = mid + 1;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return new int[] { startPos, endPos };

	}

}
