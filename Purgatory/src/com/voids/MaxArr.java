package com.voids;

public class MaxArr {
	public static void main(String[] args) {
		int [] arr= {2,2,5,2,5,2,21,342};
		System.out.println(max(arr));
	}
	public static String max(int [] arr) {
		int max=Integer.MIN_VALUE;
		int i=0;
		while(i<arr.length) {
			int temp=arr[i];
			if(temp>max) {
				max=temp;
			}
			i++;
		}
		return "max"+"::"+max;
	}
}
