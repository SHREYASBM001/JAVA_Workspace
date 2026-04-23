package com.empty;

public class SMin {

	public static void main(String[] args) {
		System.out.println(smin(new int[] {1,9,56}));

	}
	static int smin(int[] arr) {
		int m1=Integer.MAX_VALUE;
		int m2=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<m1  && m2!=arr[i]) {
				m2=m1;
				m1=arr[i];
			}
			if(arr[i]<m2 && m1!=arr[i]) {
				m2=arr[i];
			}
			
		}
		return m2;
	}
}
