package com.mock1.logics;

public class Neon {

	public static void main(String[] args) {
		int n=9;
		System.out.println(isNeon(n,n*n));
		
	}
	static boolean isNeon(int n,int sq) {
		if(n==0) return true;
		if(n==addDigits(sq)) return true;
		else return false;
		
	}
	static int addDigits(int sq) {
		if(sq==0) return 0;
		return (sq%10)+addDigits(sq/10);
		
	}

}
