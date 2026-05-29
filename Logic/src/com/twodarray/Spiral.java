package com.twodarray;

public class Spiral {
	public static void main(String[] args) {
		int[][] a=spiral(5);
		display(a);
	}
	public static int[][] spiral(int size){
		int [][] a= new int[size][size];
		int r=0,c=-1;
		char dir='r';
		for(int i=1;i<=size*size;i++) {
			switch(dir) {
			case 'r':c++;
					 a[r][c]=i;
					 if(c==size-1-r) dir='d';
					 break;	 
			case 'd':r++;
					 a[r][c]=i;
					 if(r==c) dir='l';
					 break;
			case 'l':c--;
					 a[r][c]=i;
					 if(r+c==size-1) dir='u';
					 break;
			case 'u':r--;
					 a[r][c]=i;
					 if(r==c+1) dir='r';
					 break;
			}
		}
		return a;
	}
	public static void display(int [][] a) {
		for(int[] b:a) {
			for(int temp:b) {
				System.out.print(temp+"\t");
			}
			System.out.println();
		}
	}
}
