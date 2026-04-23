package com.empty;

import java.util.Arrays;

public class DelDupEle {

	public static void main(String[] args) {
		int[] arr= {1,5,2,4,1,4,2,1};
		del(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void del(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
				}
			}
		}
	}

}
