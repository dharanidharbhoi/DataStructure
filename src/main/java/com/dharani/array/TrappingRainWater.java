package com.dharani.array;

/**
 * 
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it can trap after raining.
 * 
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 
 * Output: 6 Explanation: The above elevation map (black section) is represented
 * by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue
 * section) are being trapped.
 *
 */
public class TrappingRainWater {

	public static void main(String[] args) {

		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		System.out.println(trap(height));

	}

	public static int trap(int[] height) {

		int result = 0;

		int start = 0;
		int end = height.length - 1;

		int leftHigh = height[0];
		int rightHigh = height[height.length - 1];

		while (start < end) {

			if (height[start] <= height[end]) {

				int wl = leftHigh - height[start];
				if (wl > 0) {
					result += wl;
				}
				leftHigh = Math.max(leftHigh, height[start]);
				start++;
			} else {
				int wl = rightHigh - height[end];
				if (wl > 0) {
					result += wl;
				}
				rightHigh = Math.max(rightHigh, height[end]);
				end--;
			}

		}

		return result;

	}

}
