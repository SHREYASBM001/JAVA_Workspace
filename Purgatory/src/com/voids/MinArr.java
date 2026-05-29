package com.voids;

public class MinArr {
	public static void main(String[] args) {
		int [] arr= {1,2,4,2,45,1,7};
		System.out.println(min(arr));
	}
	static String min(int [] arr) {
		int min=Integer.MAX_VALUE;
		int i=0;
		while(i<arr.length) {
			int temp=arr[i];
			if(temp<min) {
				min=temp;
			}
			i++;
		}
		return "min"+"::"+min;
	}
}
