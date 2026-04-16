package com.dsa.arrays;

import java.util.Arrays;

public class PrintSumOfTwoUnequalArraysWithoutUsingThirdArray {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++) {
			
			b[i]+=a[i];
		}
		System.out.println(Arrays.toString(b));

	}

}
