package com.empty;

import java.util.Arrays;

public class QuickSortings {
	public static void main(String[] args) {
		int [] arr= {123,442,44,1,21};
		int start=0;
		int end=arr.length-1;
		sort(arr,start,end);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int [] arr,int st,int end) {
		if(st>=end) {
			return;
		}
		int pivot=arr[(st+end)/2];
		int i=st;
		int j=end;
		while(i<=j) {
			while(arr[i]<pivot) i++;
			while(arr[j]>pivot) j++;
			if(i<=j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		sort(arr,st,j);
		sort(arr,i,end);
	}
}
