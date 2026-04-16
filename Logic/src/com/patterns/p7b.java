package com.patterns;

public class p7b {

	public static void main(String[] args) {
		int n=7;
		int spaces=n-1;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=spaces+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			spaces--;
		}

	}

}
