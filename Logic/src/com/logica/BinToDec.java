package com.logica;
import java.util.*;
public class BinToDec {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the binary number");
		int n=sc.nextInt();
		System.out.println(binToDec(n));
	}
	static int binToDec(int n) {
	int dec=0;
	int power=0;
	while(n>0) {
		dec+=(n%10)*calcsq(2,power);
		n/=10;
		power++;
	}
	return dec;
	}
	
	static int calcsq(int base,int power) {
		int prod=1;
		for (int i=1;i<=power;i++) {
			prod*=base;
		}
		return prod;
	}

}
