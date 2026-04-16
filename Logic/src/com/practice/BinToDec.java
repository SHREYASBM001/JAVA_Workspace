package com.practice;
import java.util.Scanner;
public class BinToDec {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a binary number");
	int n=sc.nextInt();
	
	binToDec(n);
	//System.out.println(calcSq(2,2));

	}
	static void binToDec(int n) {
		int bin=0;
		int power=0;
		while(n>0) {
			bin+=(n%10)*calcSq(2,power);
			power++;
			n/=10;
		}
		System.out.println(bin);
	}
	static int calcSq(int base,int power) {
		int prod=1;
		for(int i=1;i<=power;i++) {
			prod*=base;
		}
		return prod;
	}

}
