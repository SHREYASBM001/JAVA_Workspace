package com.patterns;

public class hollow_p8 {

	public static void main(String[] args) {
		int n=5;
		int spaces=n-1;
		int stars=1;
		int m=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=stars;j++) {
				if(j==m-1 || j==m+1 || i==n)
				System.out.print("*");
			}
			m++;
			spaces--;
			stars+=2;
			System.out.println();
		}

	}

}
