package com.dharani.array;

/**
 * Write an efficient algorithm that searches for a value target in an m x n
 * integer matrix matrix. This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right. The first integer of each
 * row is greater than the last integer of the previous row. Input: matrix =
 * [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3 Output: true
 * 
 */
public class Search2DMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };

		int target = 23;

		System.out.println(searchMatrix(arr, target));

	}

	public static boolean searchMatrix(int[][] matrix, int target) {

		if (matrix == null || matrix.length == 0) {
			return false;
		}

		int length = matrix.length;

		for (int i = 0; i < length; i++) {

			if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
				return findElement(matrix[i], target);
			}

		}

		return false;
	}

	private static boolean findElement(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return true;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return false;
	}

}
