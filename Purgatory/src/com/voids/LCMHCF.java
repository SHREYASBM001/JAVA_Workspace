package com.voids;

public class LCMHCF {

	public static void main(String[] args) {
		System.out.println(LCM(16,12));
		System.out.println(HCF(16,12));

	}
	static int HCF(int a,int b) {
		if(b==0) return a;
		return HCF(b,a%b);
	}
	static int LCM(int a,int b) {
		return (a*b)/HCF(a,b);
	}
}
