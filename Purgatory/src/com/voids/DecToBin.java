package com.voids;

public class DecToBin {

	public static void main(String[] args) {
		System.out.println(decTobin(25,0));

	}
	public static int decTobin(int n,int sum) {
		if(n==0) return revNum(sum,0);
		return decTobin(n/2,sum*10+n%2);
	}
	static int revNum(int n,int rev) {
		if(n==0) return rev;
		return revNum(n/10,rev*10+n%10);
	}

}
