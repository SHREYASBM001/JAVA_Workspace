package com.voids;

public class Trib {

	public static void main(String[] args) {
		System.out.println(trib(5));

	}
	static int trib(int n) {
		if(n==1) return 0;
		if(n==2) return 1;
		if(n==3) return 1;
		return trib(n-1)+trib(n-2)+trib(n-3);
	}

}
