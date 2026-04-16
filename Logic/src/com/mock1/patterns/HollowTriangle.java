package com.mock1.patterns;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {2,6,3,8,2};
		int i=1;
		int j=i+1;
		while(i<j) {
			i=1;
			j=i+1;
		while(i<j){
			
			if(j<a.length && a[i]<a[j]) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
				j++;
				
			}
		}
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[i]);
		}
		}
	}


