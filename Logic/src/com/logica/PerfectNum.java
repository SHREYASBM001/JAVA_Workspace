package com.logica;

public class PerfectNum {

	public static void main(String[] args) {
		int n=8129;
		if(isPerfectNum(n)) System.out.println(n+" : is a perfect number");
		else System.out.println(n+" : is not a perfect number");

	}
	static boolean isPerfectNum(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return n==sum;
	}

}
