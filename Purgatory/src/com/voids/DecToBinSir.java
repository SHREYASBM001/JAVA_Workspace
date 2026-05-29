package com.voids;

public class DecToBinSir {

	public static void main(String[] args) {
		System.out.println(decTobin(25));

	}
	static int decTobin(int n) {
		int i=1;
		int bin=0;
		while(n>0) {
			int bit=n%2;
			bin=bit*i+bin;
			i*=10;
			n/=2;
		}
		return bin;
	}

}
