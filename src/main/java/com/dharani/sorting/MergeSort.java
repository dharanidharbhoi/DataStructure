package com.dharani.sorting;

public class MergeSort {

	public static void main(String[] args) {

		
		int arr[] = {38, 27, 43, 3, 9, 82, 10};
		
		mergeSortArray(arr,0,arr.length-1);
		
		for(int i:arr) {
			System.out.println(i);
		}
	}

	private static void mergeSortArray(int[] arr,int left,int right) {
		
             if(left < right) {
            	   int mid = left + (right-left)/2;
                   mergeSortArray(arr, left, mid);
                   mergeSortArray(arr, mid+1, right);
                   merge(arr,left,mid,right);
             }
             
         
		
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		
	
		
		 int left1 = mid-left+1;
		 int right1 = right-mid;
		 
		 int leftArr[] = new int[left1];
		 int rightArr[] = new int[right1];
		 
		 for(int i=0;i<left1;i++) {
			 leftArr[i] = arr[left+i];
		 }
		 for(int j=0;j<right1;j++) {
			 rightArr[j] = arr[mid+j+1];
		 }
		 
		int k =left;
		int i=0,j=0;
		while(i<left1 && j < right1) {
			if(leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i<left1 ) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j<right1) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
	}

}
