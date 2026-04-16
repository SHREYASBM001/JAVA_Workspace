package com.logica;
import java.util.Scanner;
public class StrongNum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter a number");
	int n=sc.nextInt();
	System.out.println(isStrongNum(n));
	// System.out.println(fact(n));
	}
	static boolean isStrongNum(int n) {
		int m=n;
		int sum=0;
		if(n==0) return false;
		while(n>0) {
			sum+=fact(n%10);
			n/=10;
		}
		return m==sum;
	}
	static int fact(int n) {
		if(n==0) return 1;
		int prod=1;
		for(int i=1;i<=n;i++) {
			prod*=i;
		}
		return prod;
	}

}
