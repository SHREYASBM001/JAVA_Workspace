package com.practice;

public class Fib {

	public static void main(String[] args) {
		int n=20;
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<=n;i++) {
			c+=a;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
