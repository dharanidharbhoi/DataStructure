package com.dharani.problems;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1,1,1,1},
				       {2,2,2,2},
				       {3,3,3,3},
				       {4,4,4,4}
						};

		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i] + "  ");
			}
			System.out.println();
		}
	}

}
