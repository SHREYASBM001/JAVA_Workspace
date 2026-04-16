package com.logica;
import java.util.Scanner;
public class AutoMorphic {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isAutoMorphic(n));

	}
	static boolean isAutoMorphic(int n) {
	int sqDigits=0;
	int nDigits=0;
	int sq=sq(n);
	while (n>0) {
		sqDigits=sq%10;
		nDigits=n%10;
		if(nDigits!=sqDigits) {
			return false;
		}
		sq/=10;
		n/=10;
	}
	return true;
	}
	static int sq(int n) {
		
		return n*n;
	}
}
