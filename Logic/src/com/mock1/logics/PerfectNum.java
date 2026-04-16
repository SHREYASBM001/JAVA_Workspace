package com.mock1.logics;

public class PerfectNum {

	public static void main(String[] args) {
		int n=28;
		System.out.println(isPerfect(n,1)==n);

	}
	static int isPerfect(int n,int i) {
		if(n==0) return 0;
		if(i>n/2) return 0;
		if(n%i==0) return i+isPerfect(n,i+1);
		else return isPerfect(n,i+1);
		
	}

}
