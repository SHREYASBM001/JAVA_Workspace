package com.mock1.logics;

public class Strong {

	public static void main(String[] args) {
		int n=145;
		System.out.println(isStrong(n)==n);

	}
	static int fact(int n) {
		if(n==0) return 1;
		return n*fact(n-1);
		
		
	}
	static int isStrong(int n) {
		if(n==0) return 0;
		return fact(n%10)+isStrong(n/10);
		
	}

}
