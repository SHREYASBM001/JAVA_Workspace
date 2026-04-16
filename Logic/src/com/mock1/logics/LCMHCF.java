package com.mock1.logics;

public class LCMHCF {

	public static void main(String[] args) {
		System.out.println(HCF(12,16));
		System.out.println(LCM(12,16));
		

	}
	static int HCF(int  a,int b) {
		if(b==0) return a;
		return HCF(b,a%b);
	}
	static int LCM(int a ,int b) {
		
		return (a*b)/HCF(a,b);
	}

}
