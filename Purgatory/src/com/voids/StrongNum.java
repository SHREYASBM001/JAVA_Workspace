package com.voids;

public class StrongNum {

	public static void main(String[] args) {
		int n=145;
		System.out.println(isStrong(n)==n);

	}
	static int isStrong(int n) {
		if(n==0) return 0;
		return fact(n%10)+isStrong(n/10);
	}
	static int fact(int n) {
		if(n==0) return 1;
		return n*fact(n-1);
	}

}
