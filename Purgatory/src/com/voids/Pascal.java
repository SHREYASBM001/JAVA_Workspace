package com.voids;

public class Pascal {
	public static void main(String[] args) {
		pascal(5);
	}
	public static void pascal(int size) {
		int [][] a=new int[size][];
		int spaces=size-1;
		
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0 || i==j) {
					a[i][j]=1;
				} else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		for(int [] b:a) {
			for(int i=1;i<=spaces;i++) {
				System.out.print(" ");
			}
			for(int temp: b) {
				System.out.print(temp+" ");
			}
			System.out.println();
			spaces--;
		}
	}
	
	
}
