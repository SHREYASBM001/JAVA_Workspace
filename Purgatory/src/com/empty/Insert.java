package com.empty;

import java.util.Arrays;

public class Insert {

	public static void main(String[] args) {
		int[] arr= {4,1,6,8,0};
		s(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void s(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

}
