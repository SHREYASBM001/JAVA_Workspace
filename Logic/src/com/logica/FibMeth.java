package com.logica;

public class FibMeth {
	public static void main(String [] args) {
		fib(0,20);
		
	}
static void fib(int a,int b) {
	int c=0;
	int start=0;
	int second=1;
	if(a<=0 && b<=2) System.out.println(1);
	if(a<=0) {
		for(int i=1;i<=b;i++) {
			c+=start;
			if(start>=a) {
			System.out.println(c);
			}
			start=second;
			second=c;
		}
	}
}
}
