package com.logica;

public class Fib {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int n=29;
		for(int i=1;i<=n;i++) {
			c+=a;
			System.out.println(c);
			a=b;
			b=c;
			
		}

	}

}
