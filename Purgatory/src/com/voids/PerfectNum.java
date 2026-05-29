package com.voids;

public class PerfectNum {

	public static void main(String[] args) {
		
		System.out.println(isPerfect(6));

	}
	static boolean isPerfect(int n) {
		if(n<=1) return false;
		return sum(n,n/2)==n;
	}
	static int sum(int n,int i) {
		if(i==0) return 0;
		if(i>n/2) return 0;
		if(n%i==0) {
			return i+sum(n,i-1);
		}
		else return sum(n,i-1);
	}
}
