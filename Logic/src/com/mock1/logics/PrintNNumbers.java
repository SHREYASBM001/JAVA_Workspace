package com.mock1.logics;

public class PrintNNumbers {

	public static void main(String[] args) {
		printNNumbers(5);

	}
	static void printNNumbers(int n) {
		if(n==1) { 
			System.out.println(1);
			return;
		}
		printNNumbers(n-1);
		System.out.println(n);
		
	}

}
