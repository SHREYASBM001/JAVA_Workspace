package com.voids;

public class Spy {

	public static void main(String[] args) {
		System.out.println(isSpy(1124));

	}
	static boolean isSpy(int n) {
		return addDigits(n)==prodDigits(n);
	}
	static int addDigits(int n) {
		if(n==0) return 0;
		return n%10+addDigits(n/10);
	}
	static int prodDigits(int n) {
		if(n==0) return 1;
		return (n%10)*prodDigits(n/10);
	}
}
