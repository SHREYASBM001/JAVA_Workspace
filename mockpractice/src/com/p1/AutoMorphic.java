package com.p1;

public class AutoMorphic {

	public static void main(String[] args) {
		int n=5;
		System.out.println(isAutomorphic(n,n*n));

	}
	static boolean isAutomorphic(int n,int sq) {
		if(n==0) return true;
		if((n%10)!=(sq%10)) return false;
		return isAutomorphic(n/10,sq/10);
	}

}
