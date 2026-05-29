package com.empty;

import java.util.Arrays;

public class Quickie {

	public static void main(String[] args) {
		int [] ar= {7,5,3,2,7,0};
		s(ar,0,ar.length);
		System.out.println(Arrays.toString(ar));

	}
	static void s(int [] arr,int st,int e) {
		if(st>=e) return;
		int start=st;
		int end=e;
		int mid=arr[(start+end)/2];
		int i=start;
		int j=end;
		while(end!=start) {
			
			while(arr[i]>arr[mid] && i<arr.length) i++;
			while(arr[j]<arr[mid] && i>=0) j--;
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		s(arr,start,mid);
		s(arr,mid,end);
		
	}

}
