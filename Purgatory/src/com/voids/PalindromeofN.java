package com.voids;

public class PalindromeofN {

	public static void main(String[] args) {
		System.out.println(pal(121));
	}
	static boolean pal(int n) {
		return n==revs(n,0);
	}
	static int revs(int n,int rev) {
		if(n==0) return rev;
		return revs(n/10,rev*10+n%10);
	}

}
