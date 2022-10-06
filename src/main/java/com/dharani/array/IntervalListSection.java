package com.dharani.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * You are given two lists of closed intervals, firstList and secondList, where
 * firstList[i] = [starti, endi] and secondList[j] = [startj, endj]. Each list
 * of intervals is pairwise disjoint and in sorted order.
 * 
 * Return the intersection of these two interval lists.
 * 
 * A closed interval [a, b] (with a <= b) denotes the set of real numbers x with
 * a <= x <= b.
 * 
 * The intersection of two closed intervals is a set of real numbers that are
 * either empty or represented as a closed interval. For example, the
 * intersection of [1, 3] and [2, 4] is [2, 3].
 *
 */
public class IntervalListSection {

	public static void main(String[] args) {

		int[][] firstList = { { 1, 3 } };// {{0,2},{5,10},{13,23},{24,25}};

		int[][] secondList = { { 5, 9 } };// {{1,5},{8,12},{15,24},{25,26}};

		int[][] result = intervalIntersection(firstList, secondList);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i][0] + " " + result[i][1]);
		}

	}

	public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

		List<int[]> list = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < firstList.length && j < secondList.length) {

			int[] first = firstList[i];
			int[] second = secondList[j];

			if (first[0] <= second[0] && second[0] <= first[1]) {

				if (first[1] <= second[1]) {
					list.add(new int[] { second[0], first[1] });
					i++;
				} else {
					list.add(new int[] { second[0], second[1] });
					j++;
				}

			} else if (second[0] <= first[0] && first[0] <= second[1]) {

				if (first[1] <= second[1]) {
					list.add(new int[] { first[0], first[1] });
					i++;
				} else {
					list.add(new int[] { first[0], second[1] });
					j++;
				}

			} else {

				if (second[0] > first[1]) {
					i++;
				}
				if (first[0] > second[1]) {
					j++;

				}
			}

		}

		int[][] res = new int[list.size()][2];

		for (int k = 0; k < list.size(); k++) {
			res[k] = list.get(k);
		}

		return res;

	}

}
