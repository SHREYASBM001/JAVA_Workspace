package com.voids;

public class ArmStrong {

	public static void main(String[] args) {
		int n=407;
		System.out.println(isArmStrong(n,getCount(n))==n);
		
	}
	static int isArmStrong(int n,int power) {
		if(n==0) return 0;
		return sq(n%10,power)+isArmStrong(n/10,power);
	}	
	static int getCount(int n) {
		if(n==0) return 0;
		return 1+getCount(n/10);
	}
	static int sq(int n,int count) {
		if(count==0) return 1;
		return n*sq(n,count-1);
		
	}
}
