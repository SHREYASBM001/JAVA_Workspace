package com.logica;

public class HarshadNum {

	public static void main(String[] args) {
		
		int n=11;
		if(isHarshad(n)) System.out.println(n+ " : is a harshad number");
		else System.out.println(n+" : is not a harshad number");
		
		printHarshad(1,200);

	}
	static boolean isHarshad(int n) {
		int m=n;
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		if(m%sum==0) {
			return true;
		}
		else return false;
	}
	static void printHarshad(int a ,int b) {
		for (int i=a;i<=b;i++) {
			if(isHarshad(i)) {
				System.out.println(i);
			}
		}
	}

}
