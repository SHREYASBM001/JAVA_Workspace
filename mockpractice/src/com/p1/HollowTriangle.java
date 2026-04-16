package com.p1;

public class HollowTriangle {

	public static void main(String[] args) {
		int n=5;
		int spaces=n-1;
		int stars=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(j==1 || j==stars || i==n)
				System.out.print("*");
				else 
					System.out.print(" ");
				
			}
			spaces--;
			stars+=2;
			System.out.println();
		}

	}

}
