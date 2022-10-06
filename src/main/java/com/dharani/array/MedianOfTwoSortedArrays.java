package com.dharani.array;

/**
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
 * the median of the two sorted arrays.
 * 
 * The overall run time complexity should be O(log (m+n)).
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,3], nums2 = [2]
 * 
 * Output: 2.00000
 * 
 * Explanation: merged array = [1,2,3] and median is 2. Example 2:
 * 
 * Input: nums1 = [1,2], nums2 = [3,4] Output: 2.50000 Explanation: merged array
 * = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 */
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {

		int[] nums1 = new int[] { 1, 2 };
		int[] nums2 = new int[] { 3,4 };
		
	

		System.out.println(findMedianSortedArrays(nums1, nums2));

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		double result = 0.00;

		int[] A = nums1;
		int[] B = nums2;

		if (nums1.length > nums2.length) {
			A = nums2;
			B = nums1;
		}
		int total = A.length + B.length;
		int half = (total) / 2;

		int start = 0;
		int end = A.length - 1;

		int i = 0;
		int j = 0;

		while (true) {

			i =   (int) Math.floor((double) (start + end) / 2);
			j = half - i - 2;

			int Aleft = i >= 0 ? A[i] : Integer.MIN_VALUE;
			int Aright = i + 1 < A.length ? A[i + 1] : Integer.MAX_VALUE;
			int Bleft = j >= 0 ? B[j] : Integer.MIN_VALUE;
			int Bright = j + 1 < B.length ? B[j + 1] : Integer.MAX_VALUE;

			if (Aleft <= Bright && Bleft <= Aright) {

				if (total % 2 != 0) {
					result = Math.min(Aright, Bright);
				} else {
					System.out.println(Math.max(Aleft, Bleft) );
					System.out.println(Math.min(Aright, Bright));
					System.out.println((float)(Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2);
					result =  (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2;
				}

				break;
			} else if (Aleft > Bright) {
				end = i - 1;
			} else {
				start = i + 1;
			}

		}

		return result;

	}

}
