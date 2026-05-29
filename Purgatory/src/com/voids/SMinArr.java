package com.voids;

public class SMinArr {
	public static void main(String[] args) {
		int [] arr= {1,2,4,2,5,2,5};
		System.out.println(smin(arr));
	}
	public static String smin(int [] arr) {
		int m1=Integer.MAX_VALUE;
		int m2=Integer.MAX_VALUE;
		int i=0;
		while(i<arr.length) {
			int temp=arr[i];
			if(temp<m2 && temp>m1) {
				m2=temp;
			}
			if(temp<m1) {
				m2=m1;
				m1=temp;
			}
			i++;
		}
		return "smin"+"::"+m2;
	}
}
