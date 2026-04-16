package com.p1;

public class HollowDiamond {

	public static void main(String[] args) {
		int n=5;
		int spaces=n-1;
		int stars=1;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(j==1 || j==stars) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			stars+=2;
			spaces--;
			System.out.println();
		}
		spaces=0;
		stars=n*2-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(j==1 || j==stars)
				System.out.print("*");
				else 
					System.out.print(" ");
			}
			stars-=2;
			spaces++;
			System.out.println();
		}

	}

}
