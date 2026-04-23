package com.empty;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int[] arr= {1,4,23,2,6,2};
		
		int[] arr2=new int[arr.length];
		System.arraycopy(arr,2, arr2, 3, 3);
		System.out.println(Arrays.toString(arr2));
		
	}

}
