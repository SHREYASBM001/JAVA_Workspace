package com.twodarray;

public class CrossDiagonalSum {

	public static void main(String[] args) {
	int[][] mat= {{1,2,3},
				  {4,5,6},
				  {7,8,9}};
	int sum=0;
	for(int i=0;i<mat.length;i++) {
		sum+=mat[i][i];
	}
	}

}
