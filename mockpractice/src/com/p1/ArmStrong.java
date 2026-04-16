package com.p1;

public class ArmStrong {

	public static void main(String[] args) {
		int n=153;
		System.out.println(isArmStrong(n,getCount(n))==n);

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

}
