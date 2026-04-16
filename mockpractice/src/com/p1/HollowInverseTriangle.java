package com.p1;

public class HollowInverseTriangle {

	public static void main(String[] args) {
		int n=5;
		int spaces=0;
		int stars=n*2-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(i==1 || j==1 || j==stars) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			spaces++;
			stars-=2;
			System.out.println();
			
		}
		

	}

}
