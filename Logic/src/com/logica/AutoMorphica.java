package com.logica;

public class AutoMorphica {

	public static void main(String[] args) {
		int n=9376;
		if(isAutoMorphic(n)) System.out.println(n+" : is a Automorphic number");
		else System.out.println(n+" : is not a automorphic number");

	}
	static boolean isAutoMorphic(int n) {
		int sq=getsq(n);
		boolean flag=true;
		while(n>0) {
			if(n%10!=sq%10) {
				return false;
			}
			n/=10;
			sq/=10;
		}
		return flag;
	}
	
	static int getsq(int n) {
		return n*n;
	}

}
