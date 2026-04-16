package com.mock1.logics;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.println(reverseNum(123,0));

	}
	
	static int reverseNum(int n,int rev) {
		if(n==0) return rev;
		return reverseNum(n/10,rev*10+(n%10));
	}

}
