package com.mock1.logics;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		
		System.out.println("____________________");
		
		
		printFibRange(0,10);

	}
	static int fibonacci(int n) {
		if(n==0) return 0;
		if(n==1) return 0;
		if(n==2) return 1;
		return fibonacci(n-1)+fibonacci(n-2);
		
	}
	static void printFibRange(int a,int b) {
		for(int i=a;i<=b;i++) {
			System.out.println(fibonacci(i));
			
		}
		
	}
}
