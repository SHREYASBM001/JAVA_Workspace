package com.voids;

public class Pat {
	public static void main(String[] args) {
		int n=5;
		int spaces=n*2-1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=spaces;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
			spaces--;
		}
	}
}
