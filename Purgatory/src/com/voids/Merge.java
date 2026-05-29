package com.voids;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int [] a= {5,2,199,1};
		sort(a);
		System.out.println(Arrays.toString(a));
		
	}
	public static void sort(int [] a) {
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
			i++;
			j++;
		}
		sort(l);
		sort(r);
		merge(l,r,a);
	}
	public static void merge(int [] a,int [] b,int [] c) {
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
