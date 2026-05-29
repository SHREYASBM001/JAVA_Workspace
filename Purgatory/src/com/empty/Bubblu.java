package com.empty;

import java.util.Arrays;

public class Bubblu {
	public static void main(String[] args) {
		int arr[]= {1,2,4,1,3,1,2,6,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int arr[]) {
		for(int i=0;i<arr.length-1-i;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
