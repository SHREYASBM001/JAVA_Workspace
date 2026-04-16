package com.mock1.logics;

public class Harshad {

	public static void main(String[] args) {
		
		System.out.println(isHarshad(1729));
	}
	static boolean isHarshad(int n) {
		if(n%addDigits(n)==0) return true;
		else return false;
		
	}
	static int addDigits (int n) {
		if(n==0) return 0;
		return (n%10)+addDigits(n/10);
	}

}
