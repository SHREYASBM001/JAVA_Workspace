package com.recursion;

public class AddDIgits {

	public static void main(String[] args) {
		System.out.println(addDigits(1234));

	}
	static int addDigits(int n) {
		if(n==0) return 0;
		return (n%10)+addDigits(n/10);
	}

}
