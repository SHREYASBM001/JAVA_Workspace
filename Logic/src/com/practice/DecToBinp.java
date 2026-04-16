package com.practice;

public class DecToBinp {

	public static void main(String[] args) {
		int n=11001;
		
		System.out.println(decToBinp(n));

	}
	static int decToBinp(int n) {
		int sum=0;
		int power=0;
		while(n>0) {
			sum+=(n%10)*calc(2,power);
			power++;
			n/=10;
		}
		return sum;
	}
	static int calc(int base,int power) {
		int prod=1;
		for(int i=1;i<=power;i++) {
			prod*=base;
		}
		return prod;
	}

}
