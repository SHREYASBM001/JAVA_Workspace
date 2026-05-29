package com.voids;

public class Kadane {
	public static void main(String[] args) {
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(test(arr));
	}
	public static int test(int[] arr) {
		int maxsumsofar=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum<0) {
				sum=0;
			}
			if(sum>maxsumsofar) {
				maxsumsofar=sum;
			}
		}
		return maxsumsofar;
	}
}
