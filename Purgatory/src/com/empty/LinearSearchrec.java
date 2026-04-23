package com.empty;

public class LinearSearchrec {

	public static void main(String[] args) {
		System.out.println(find(new int[] {1,2,4,6,7},7,0));

	}
	static int find(int[] arr,int key,int i) {
		if(i==arr.length) return -1;
		if(arr[i]==key) return i;
		return find(arr,key,i+1);
	}
}
