package com.voids;

import java.util.Arrays;

public class Quikie {
	public static void main(String[] args) {
		int[] a= {1,2,54,2,1,331,11};
		int start=0;
		int end=a.length-1;
				
		quick(a,start,end);
		System.out.println(Arrays.toString(a));
	}
	public static void quick(int[] a,int start,int end) {
		if(start>=end) return;
		int i=start,j=end;
		int pivot=a[(start+end)/2];
		while(i<=j) {
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		quick(a,start,j);
		quick(a,i,end);
	}
}
