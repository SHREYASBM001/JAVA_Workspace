package com.logica;
import java.util.*;
public class RevNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		revNum(n);
	}
	static void revNum(int n) {
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum*10+d;
			System.out.print(d);
			
			n/=10;
		}
		System.out.println();
		System.out.print(sum);
	}

}
