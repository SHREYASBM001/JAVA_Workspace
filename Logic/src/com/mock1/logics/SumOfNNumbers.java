package com.mock1.logics;

public class SumOfNNumbers {

	public static void main(String[] args) {
		System.out.println(sumOfNNumbers(5));

	}
	static int sumOfNNumbers(int n) {
		if(n==0) return 0;
		return n+sumOfNNumbers(n-1);
		
	}

}
