package com.voids;

public class PrintNumrev {

	public static void main(String[] args) {
	printnum(5);

	}
	static void printnum(int n) {
		if(n==0) return;
		System.out.println(n);
		printnum(n-1);
	}

}
