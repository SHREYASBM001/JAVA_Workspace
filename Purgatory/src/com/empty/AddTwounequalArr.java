package com.empty;

import java.util.Arrays;

public class AddTwounequalArr {

	public static void main(String[] args) {
		sum(new int[] {1,2,3},new int[] {1,2,3,4,5,6});

	}
	static void sum(int[] arr1,int[] arr2) {
		int len;
		if(arr1.length<arr2.length) {
			len=arr1.length;
		} else { 
			len=arr2.length;
		}
		for(int i=0;i<len;i++) {
			if(arr1.length>arr2.length) {
				arr1[i]+=arr2[i];
			} else {
				arr2[i]+=arr1[i];
			}
		}
		if(arr1.length>arr2.length) {
			System.out.println(Arrays.toString(arr1));
		} else {
			System.out.println(Arrays.toString(arr2));
		}
	}
}
