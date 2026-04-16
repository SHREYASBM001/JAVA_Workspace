package com.mock1.logics;

public class CountDigits {

	public static void main(String[] args) {
		System.out.println(countDigits(123));

	}
	static int countDigits(int n) {
		if(n==0) return 0;
		return 1+countDigits(n/10);
	}

}
