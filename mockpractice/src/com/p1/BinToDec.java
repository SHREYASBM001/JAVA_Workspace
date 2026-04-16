package com.p1;

public class BinToDec {

	public static void main(String[] args) {
		int n=11001;
		int sum=0;
		int power=0;
		while(n>0) {
			
			sum+=(n%10)*prod(2,power);
			power++;
			n/=10;
		}
		System.out.println(sum);
		

	}
	static int prod(int base,int power) {
		int prod=1;
		for(int i=1;i<=power;i++) {
			prod*=base;
		}
		return prod;
		
	}

}
