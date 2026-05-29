package com.empty;

import java.util.Arrays;

public class SelectionSorting {
	public static void main(String[] args) {
		int [] arr= {23,45,3,2,42,2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) {
					index=j;
				}
			}
			if(!(i==index)) {
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;	
			}
		}
	}
}
