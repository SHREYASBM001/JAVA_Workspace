package com.voids;

public class SMaxArr {
	public static void main(String[] args) {
		int arr[]= {1,4,3,2,3,1,1,2};
		System.out.println(smax(arr));
	}
	static String smax(int [] arr) {
		int m1=Integer.MIN_VALUE;
		int m2=Integer.MIN_VALUE;
		int i=0;
		while(i<arr.length) {
			int temp=arr[i];
			if(temp>m2 && temp<m1) {
				m2=temp;
			}
			if(temp>m1) {
				m2=m1;
				m1=temp;
			}
			i++;
		}
		return "smax"+":"+m2;
	}
}
