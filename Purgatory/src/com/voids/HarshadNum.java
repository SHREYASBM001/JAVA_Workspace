package com.voids;

public class HarshadNum {

	public static void main(String[] args) {
	
		System.out.println(isHarshad(18));

	}
	static boolean isHarshad(int n) {
		if(n%addDigits(n)==0) {
			return true;
		}
		else return false;
	}
	static int addDigits(int n) {
		if(n==0) return 0;
		return n%10+addDigits(n/10);
	}

}
