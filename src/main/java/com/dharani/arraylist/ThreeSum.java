package com.dharani.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javafx.collections.transformation.SortedList;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j],
 * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
 * nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets. Input: nums
 * = [-1,0,1,2,-1,-4] Output: [[-1,-1,2],[-1,0,1]]
 *
 */
public class ThreeSum {

	public static void main(String[] args) {

		int[] nums = new int[] { -1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4 };

		// System.out.println(Arrays.binarySearch(nums, 2));

		List<List<Integer>> list = threeSum(nums);

		list.stream().flatMap(num -> num.stream()).collect(Collectors.toList()).stream().forEach(System.out::println);
		System.out.println();
		System.out.println("New Method");
		List<List<Integer>> list1 = threeSumModified(nums);
		list1.stream().flatMap(num -> num.stream()).collect(Collectors.toList()).stream().forEach(System.out::println);

	}

	private static List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);

		Set<List<Integer>> list = new HashSet<>();

		for (int i = 0; i <= nums.length - 3; i++) {

			for (int j = i + 1; j <= nums.length - 2; j++) {

				int result = 0 - (nums[i] + nums[j]);
				int index = Arrays.binarySearch(nums, j, nums.length, result);
				if (index > j) {
					List<Integer> res = Arrays.asList(nums[i], nums[j], nums[index]);
					res.sort(Comparator.naturalOrder());
					list.add(res);
				}

			}

		}

		return new ArrayList<>(list);
	}

	private static List<List<Integer>> threeSumModified(int[] nums) {

		Arrays.sort(nums);

		List<List<Integer>> list = new LinkedList<>();

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

				int target = 0 - nums[i];

				int start = i + 1;
				int end = nums.length - 1;

				while (start < end) {

					if (nums[start] + nums[end] == target) {
						list.add(Arrays.asList(nums[i], nums[start], nums[end]));
						while (start < end && nums[start] == nums[start + 1]) {
							start++;
						}
						while (start < end && nums[end] == nums[end - 1]) {
							end--;
						}
						start++;
						end--;

					} else if (nums[start] + nums[end] < target) {
						start++;
					} else {
						end--;

					}

				}

			}
		}

		return list;
	}

}
