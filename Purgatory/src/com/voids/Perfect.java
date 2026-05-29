package com.voids;

public class Perfect {

	public static void main(String[] args) {
		System.out.println(isPerfect(6));

	}
	static boolean isPerfect(int n) {
		return n==getsumdiv(n);
	}
	static int getsumdiv(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

}
