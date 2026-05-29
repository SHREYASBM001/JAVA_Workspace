package com.voids;

public class PrintNum {

	public static void main(String[] args) {
		printnum(5);

	}
	static void printnum(int n) {
		if(n==0) {
			return;
		}
		
		printnum(n-1);
		System.out.println(n);
	}

}
