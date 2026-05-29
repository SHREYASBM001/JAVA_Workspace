package com.voids;

public class Test1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			b=a/b;
			try {
				b=a/b;
			}
			catch(Exception e) {
				System.out.println("l");
			}
		} catch(ArithmeticException e) {
			try {
				b=a/b;
			}
			catch(Exception d) {
			System.out.println("j");
			}
			System.out.println("h");
		}
	}
}
