package com.empty;

import java.util.Arrays;

public class QuickieSort {
	public static void main(String[] args) {
		int [] arr= {34,12,551,112,2,10};
		int start=0;
		int end=arr.length-1;
		sort(arr,start,end);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int [] arr,int start,int end) {
		if(start>=end) return;
		int i=start,j=end;
		int pivot=arr[(start+end)/2];
		while(i<=j) {
			while(arr[i]<pivot) i++;
			while(arr[j]>pivot) j--;
			if(i<=j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		sort(arr,start,j);
		sort(arr,i,end);
	}
}
