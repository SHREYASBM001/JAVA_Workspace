package com.voids;

public class BinToDec {

	public static void main(String[] args) {
		System.out.println(BinToDec(11001));

	}
	static int BinToDec(int n) {
		int power=0;
		int dec=0;
		while(n>0) {
			dec+=produ(power)*(n%10);
			power++;
			n/=10;
		}
		return dec;
	}
	static int produ(int power) {
		int prod=1;
		for(int i=1;i<=power;i++) {
			prod*=2;
		}
		return prod;
	}
	

}
