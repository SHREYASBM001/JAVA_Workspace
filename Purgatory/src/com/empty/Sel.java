package com.empty;

import java.util.Arrays;

public class Sel {

	public static void main(String[] args) {
		int [] arr= {4,7,2,1,0};
		
		for(int i=0;i<arr.length;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
