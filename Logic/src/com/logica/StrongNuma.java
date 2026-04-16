package com.logica;

public class StrongNuma {

	public static void main(String[] args) {
		int n=40;
		if(isStrong(n)) System.out.println(n+" : is a Strong Num");
		else System.out.println(n+" : is not a Strong num");

	}
	static boolean isStrong(int n) {
		int m=n;
		int sum=0;
		while(n>0) {
			sum+=fact(n%10);
			n/=10;
		}
		return sum==m;
		
	}
	static int fact(int n) {
		int prod=1;
		for(int i=1;i<=n;i++) {
			prod*=i;
		}
		return prod;
	}

}
