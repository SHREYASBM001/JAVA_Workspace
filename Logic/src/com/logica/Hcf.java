package com.logica;
import java.util.*;
public class Hcf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		hCF(a,b);
		
	}
	static void hCF(int a,int b) {
		int prod=1;
		int c=a;
		int i=1;
		int j=1;
		int rema1=0;
		int rema2=0;
		while(a<=c) {
			int factors=1;
			if(a%i==0) {
				System.out.println(i);
				a/=i;
			}
			i++;
			
		}
		System.out.println(prod);
	}

}
