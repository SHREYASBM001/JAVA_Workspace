package com.mock1.logics;

public class PalindromeNumberCheck {

	public static void main(String[] args) {
		System.out.println(palindromeNumberCheck(121));

	}
	static boolean palindromeNumberCheck(int n) {
		if(n<10) return true;
		if(n==reverse(n,0)) return true;
		else return false;
		
	}
	static int reverse(int n,int rev) {
		if(n==0) return rev;
		return reverse(n/10,rev*10+(n%10));
		
	}
}
