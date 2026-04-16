package com.dsa.arrays;

import java.util.Arrays;

public class PrintDistinctElementsInTwoArrayAnotherWay {

	public static void main(String[] args) {
		int[] arr= {2,1,3};
		int[] arr2= {4,5,1,2,3};
		int[] fin=new int[arr.length+arr2.length];
		
		for(int i=0;i<arr.length;i++) {
			fin[i]=arr[i];
		}
		int k=0;
		for(int i=arr.length;i<arr2.length;i++) {
			fin[i]=arr2[k];
			k++;
		}
		//System.out.println(Arrays.toString(fin));
		for(int i=0;i<fin.length;i++) {
			
			for(int j=i+1;j<fin.length;j++) {
				if(fin[i]==fin[j]) {
					fin[j]=0;
				}
			}
		}
		System.out.println(Arrays.toString(fin));

	}

}
