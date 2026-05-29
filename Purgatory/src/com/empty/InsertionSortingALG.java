package com.empty;

import java.util.Arrays;

public class InsertionSortingALG {
	public static void main(String[] args) {
		int [] arr= {1000,5,2,2,6,1,221};
		sort(arr);
		System.err.println(Arrays.toString(arr));
	}
	static void sort(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
		}
	}
}
