package com.mock1.patterns;

public class Diamond {
static int n=5;
static int spaces=n-1;
static int stars=1;
	public static void main(String[] args) {
		for(int i=1;i<n;i++) {
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
		spaces=0;
		stars=n*2-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			spaces++;
			stars-=2;
			System.out.println();
			
		}

	}

}
