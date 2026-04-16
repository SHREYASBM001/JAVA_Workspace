package com.mock1.logics;

public class ArmStrong {

	public static void main(String[] args) {
		int n=153;
		System.out.println(isArmStrong(n,getCount(n))==n);
		System.out.println("+++++++++++++++");
		printArmStrongRange(1,1000);
	}
	static int getCount(int n) {
		if(n==0) return 0;
		return 1+getCount(n/10);
		
	}
	static int sq(int base,int power) {
		if(power==0) return 1;
		return base*sq(base,power-1);
	}
	static int isArmStrong(int n,int power) {
		if(n==0) return 0;
		return sq((n%10),power)+isArmStrong(n/10,power);
		
	}
	static void printArmStrongRange(int a,int b) {
		for(int i=a;i<=b;i++) {
			
			if(isArmStrong(i,getCount(i))==i) System.out.println(i);
			
		}
		
	}
}
