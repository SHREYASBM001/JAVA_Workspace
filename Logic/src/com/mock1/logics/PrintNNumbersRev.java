package com.mock1.logics;

public class PrintNNumbersRev {

	public static void main(String[] args) {
		printNNumbersRev(5);

	}
	static void printNNumbersRev(int n) {
		if(n==0) return;
		System.out.println(n);
		printNNumbersRev(n-1);
		
	}

}
