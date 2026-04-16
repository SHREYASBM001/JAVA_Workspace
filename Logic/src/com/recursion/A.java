package com.recursion;

public class A {

	public static void main(String[] args) {
		printNum(1);

	}
	static void printNum(int n) {
		System.out.println(n);
		if(n+1<=10) {
			printNum(n+1);
			}
	}

}
