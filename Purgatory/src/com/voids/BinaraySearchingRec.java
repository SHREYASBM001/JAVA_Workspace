package com.voids;

public class BinaraySearchingRec {

	public static void main(String[] args) {
	int arr[]= {1,2,3,5,7,8};
	int key=8;
	int st=0;
	int end=arr.length-1;
	System.out.println(search(arr,key,st,end));
	}
	static int search(int arr[],int key,int st,int end) {
		int mid=(st+end)/2;
		if(st>end) return -1;
		if(key==arr[mid]) return mid;
		else if(key<arr[mid]) return search(arr,key,st,mid-1);
		else return search(arr,key,mid+1,end);
	}

}
