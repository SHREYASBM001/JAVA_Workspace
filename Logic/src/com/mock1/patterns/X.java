package com.mock1.patterns;

public class X {
static int n=5;
	public static void main(String[] args) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || i+j==n+1) {
					System.out.print("*");
				}
				else  {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
