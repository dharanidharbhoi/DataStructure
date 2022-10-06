package com.dharani.array;

/**
 * 
 * Given an integer array nums, return the number of reverse pairs in the array.
 * 
 * A reverse pair is a pair (i, j) where 0 <= i < j < nums.length and nums[i] >
 * 2 * nums[j].
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,3,2,3,1] Output: 2 Example 2:
 * 
 * Input: nums = [2,4,3,5,1] Output: 3i
 *
 */
public class ReversePair {

	static int count = 0;

	public static void main(String[] args) {

		int[] arr = {5,4,3,2,1};

		mergeSortArray(arr, 0, arr.length - 1);

		System.out.println(count);

	}

	private static void mergeSortArray(int[] arr, int left, int right) {

		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSortArray(arr, left, mid);
			mergeSortArray(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}

	}

	private static void merge(int[] arr, int left, int mid, int right) {

		int left1 = mid - left + 1;
		int right1 = right - mid;

		int leftArr[] = new int[left1];
		int rightArr[] = new int[right1];

		for (int i = 0; i < left1; i++) {
			leftArr[i] = arr[left + i];
		}
		for (int j = 0; j < right1; j++) {
			rightArr[j] = arr[mid + j + 1];
		}

		int i = 0, j = 0;

		// it checks if the element in left array qualifies for reverse pair
		for (i = 0; i < left1; i++) {

			//if the  element of right element qualifies than all the element before that also qualifies for that also
			//thats why we are adding the length it has travelled
			while (j < right1 && leftArr[i] > 2 * rightArr[j]) {
				j++;
			}
			count += j;


		}

		int k = left;
		i = 0;
		j = 0;
		while (i < left1 && j < right1) {
			if (leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < left1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < right1) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}

	}

}
