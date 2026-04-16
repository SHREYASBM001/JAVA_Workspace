package com.logica;

public class NeonNum {

	public static void main(String[] args) {
		int n=11;
		if(isNeon(n)) System.out.println(n+" : is a neon number");
		else System.out.println(n+" : Not a Neon Number");

	}
	static boolean isNeon(int n) {
		int sq=n*n;
		int sum=0;
		while(sq>0) {
			sum+=sq%10;
			sq/=10;
		}
		return sum==n;
	}

}
