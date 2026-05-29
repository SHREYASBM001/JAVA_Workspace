package com.voids;

public class BinarySearching {
	public static void main(String[] args) {
		int[] arr= {1,1,2,4,5,7,8,8};
		int key=8;
		System.out.println(search(arr,key));
	}
	public static int search(int[] arr,int key) {
		int st=0;
		int end=arr.length-1;
		while(st<end) {
			int mid=(st+end)/2;
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]) {
				end=mid-1;
			} else {
				st=mid+1;
			}
		}
		return -1;
	}
}
