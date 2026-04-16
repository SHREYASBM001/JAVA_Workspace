package com.mock1.logics;

public class Tribonacci {

	public static void main(String[] args) {
		System.out.println(tribonacci(5));

	}
	static int tribonacci(int n) {
		if(n==0) return 0;
		if(n==1) return 0;
		if(n==2) return 0;
		if(n==3) return 1;
		return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
		
	}
}
