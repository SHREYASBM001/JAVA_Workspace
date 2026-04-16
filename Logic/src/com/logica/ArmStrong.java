package com.logica;

public class ArmStrong {

	public static void main(String[] args) {
		int n=153;
		
		if(isArmStrong(n)) System.out.println(n+ " : is a armStrong number");
		else System.out.println(n+" : is not a armStrong number");
		
		printArmRange(0,1000);

	}
	static boolean isArmStrong(int n) {
		int m=n;
		int pow=getPower(n);
		int sum=0;
	while (n>0) {
		int digit=n%10;
		sum+=sq(digit,pow);
		n/=10;
	}
	return sum==m;
	}
	static int getPower(int n) {
		int count=0;
		while(n>0) {
			n/=10;
			count++;
		}
		return count++;
	}
	static int sq(int base,int power) {
		int prod=1;
		for(int i=1;i<=power;i++) {
			prod*=base;
		}
		return prod;
	}
	static void printArmRange(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(isArmStrong(i)) {
				System.out.println(i);
			}
		}
	}
	

}
