package com.twodarray;

public class MatMul {

	public static void main(String[] args) {
		int[][] a= {{2,3},{2,3}};
		int[][] c=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					c[i][j]+=a[i][k]*a[k][j];
				}
			}
		}
		for(int[] b: c) {
			for(int d: b) {
				System.out.print(d+"\t");
			}
			System.out.println();
		}
		

	}

}
