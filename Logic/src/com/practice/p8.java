package com.practice;

public class p8 {

	public static void main(String[] args) {
		int n=13;
		int spaces=n-1;
		int stars=1;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
				
			}
			spaces--;
			stars+=2;
			System.out.println();
		}

	}

}
