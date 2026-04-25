package com.empty;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		int arr[]= {1,2,6,8,4,1,0};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			
		}
	}
}
