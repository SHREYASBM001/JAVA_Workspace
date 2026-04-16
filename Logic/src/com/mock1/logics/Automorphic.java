package com.mock1.logics;

public class Automorphic {

	public static void main(String[] args) {
		int n=25;
		System.out.println(isAutomorphic(n,n*n));

	}
	static boolean isAutomorphic(int n,int sq) {
		if(n==0) return true;
		if((n%10)!=(sq%10)) return false;
		else return isAutomorphic(n/10,sq/10);
	}

}
