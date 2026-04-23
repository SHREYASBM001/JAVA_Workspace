package com.empty;

import java.util.Arrays;

public class AppearOnlyOnce {

	public static void main(String[] args) {
		prints(new int[] {1,2,4,2,4,1,8});

	}
	static void prints(int[] arr) {
		int[] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			boolean flag=true;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr2[j]) {
					flag=false;
				}
			}
			if(flag) arr2[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
