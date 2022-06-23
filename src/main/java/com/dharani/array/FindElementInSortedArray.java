package com.dharani.array;

/**
 * Given a Sorted Array find the element
 * 
 * @author dbhoi
 *
 */
public class FindElementInSortedArray {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 8, 17, 29, 56, 83, 99, 120 };

		System.out.println(
				"Finding the element through Divide & Conquer : " + findByDivideAndConquer(arr, 2, 0, arr.length));

	}

	private static Integer findByDivideAndConquer(int[] arr, int element, int low, int high) {

		int mid = (low + high) / 2;

		if (element == arr[mid]) {
			return mid;
		}

		if (element >= arr[low] && element < arr[mid]) {
			return findByDivideAndConquer(arr, element, 0, mid);
		} else if (element > arr[mid] && element <= arr[high - 1]) {
			return findByDivideAndConquer(arr, element, mid, high);
		}

		return -1;
	}

}
