package com.patterns;

public class p4 {

	public static void main(String[] args) {
		int n=13;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || (i<=(n/2)+1 && j==1) || (i>=(n/2)+1 && j==n) || i==(n/2)+1){
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
