package com.empty;

import java.util.Arrays;

public class MergeSorting {
	public static void main(String[] args) {
		int a[]= {1,2,54};
		int b[]= {13,44,66};
		int c[]=new int[a.length+b.length];
		int d[]= {77,22,32,113,73,21,21,11};
		merge(a,b,c);
		System.out.println(Arrays.toString(c));
		sort(d);
		System.out.println(Arrays.toString(d));
	}
	public static void sort(int[] a) {
		if(a.length<=1) return;
		int[] l=new int[a.length/2];
		int[] r=new int[a.length-l.length];
		int i=0,j=0;
		while(i<l.length) {
			l[i]=a[i];
			i++;
		}
		while(j<r.length) {
			r[j]=a[i];
			j++;
			i++;
		}
		sort(l);
		sort(r);
		merge(l,r,a);
	}
	public static void merge(int a[],int b[],int c[]) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			} else {
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			c[k]=b[j];
			k++;
			j++;
		}
	}
}
