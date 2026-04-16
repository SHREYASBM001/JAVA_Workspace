package com.practice;

public class BinToDecp {

	public static void main(String[] args) {
		int n=25;
		
		System.out.println(binToDecp(n));
		System.out.println(binToDecpp(n));
	}
	static int binToDecp(int n) {
		int sum=0;
		int bin=0;
		while(n>0) {
			sum=sum*10+(n%2);
			n/=2;
		}
		while(sum>0) {
			bin=bin*10+(sum%10);
			sum/=10;
		}
		return bin;
	}
	static int binToDecpp(int n) {
		int bin=0;
		int i=1;
		while(n>0) {
			int bit=n%2;
			bin=bit*i +bin;
			i*=10;
			n/=2;
		}
		return bin;
	}

}
