package com.voids;

public class Neon {

	public static void main(String[] args) {
		System.out.println(isNeon(9));
	}
	static boolean isNeon(int n) {
		return n==sumprodsq(n*n);
	}
	static int sumprodsq(int n) {
		if(n==0) return 0;
		return n%10+sumprodsq(n/10);
	}

}
