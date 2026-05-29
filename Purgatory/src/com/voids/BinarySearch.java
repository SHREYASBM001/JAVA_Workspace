package com.voids;

public class BinarySearch {
	public static void main(String[] args) {
		int [] arr= {1,2,3,5,6,7};
		int key=5;
		System.out.println(bin(arr,key));
	}
	public static int bin(int [] arr,int key) {
		
		int st=0;
		int end=arr.length-1;
		
		while(st<=end) {
			int mid=(st+end)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				end=mid-1;
			}
			else {
				st=mid+1;
			}
		}
		return -1;
	}
}
