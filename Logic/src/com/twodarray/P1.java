package com.twodarray;

import java.util.Arrays;

public class P1 {

	public static void main(String[] args) {
	int[][]a= {{1,2,3},
               {4,5,6},
               {7,8,9}};
	int sum=0;
	
	System.out.println("Sum:"+sum);

	for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
	System.out.print(a[i][j]+" ");
	}	System.out.println();
	}
	for(int k=0;k<a.length;k++) {
		sum=sum+a[k][k];
	}

	System.out.println("Sum of diagonal elements:"+sum);
	
	}

	}


