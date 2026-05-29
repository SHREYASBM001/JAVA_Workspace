package com.empty;

import java.util.Arrays;

public class QuickSorting {
	public static void main(String[] args) {
		int [] arr= {14,55,611,21,1,3};
		int st=0;
		int end=arr.length-1;
		sort(arr,st,end);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int [] arr,int start,int end) {
		if(start>=end) {
			return;
		}
		int i=start;
		int j=end;
		int mid=arr[(start+end)/2];
		while(i<=j) {
			while(arr[i]<mid) i++;
			while(arr[j]>mid) j--;
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
