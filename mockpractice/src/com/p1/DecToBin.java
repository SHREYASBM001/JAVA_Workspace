package com.p1;

public class DecToBin {

	public static void main(String[] args) {
		int n=25;
		
		
		int bin=0;
		int i=1;
		while(n>0) {
			int bit=(n%2);
			bin=bit*i+bin;
			n/=2;
			i*=10;
		}
		System.out.println(bin);
	}

}
