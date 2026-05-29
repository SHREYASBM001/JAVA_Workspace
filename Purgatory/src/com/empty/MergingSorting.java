package com.empty;

import java.util.Arrays;

public class MergingSorting {
	public static void main(String[] args) {
		int []  arr= {33,1,0,22,654,0};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int [] arr) {
		if(arr.length<=1) return;
		int [] l=new int[arr.length/2];
		int [] r=new int[arr.length-l.length];
		int i=0,j=0;
		while(i<l.length) {
			l[i]=arr[i];
			i++;
		}
		while(j<r.length) {
			r[j]=arr[i];
			i++;
			j++;
		}
		sort(l);
		sort(r);
		merge(l,r,arr);
	}
	public static void merge(int a[],int b[],int c[]) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else {
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
	}
}
