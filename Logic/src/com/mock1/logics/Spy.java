package com.mock1.logics;

public class Spy {

	public static void main(String[] args) {
		System.out.println(isSpy(4211));

	}
	static boolean isSpy(int n) {
		if(n<10) return true;
		if(addDigits(n)==prodDigits(n)) return true;
		else return false;
		
		
	}
	static int addDigits(int n) {
		if(n==0) return 0;
		return (n%10)+addDigits(n/10);
	}
	static int prodDigits(int n) {
		if(n==0) return 1;
		return (n%10)*prodDigits(n/10);
	}

}
