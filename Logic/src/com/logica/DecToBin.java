package com.logica;
import java.util.*;
public class DecToBin {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	
	decToBin(n);
	decToBinSir(n);

	}
	static void decToBin(int n) {
		int sum=0;
		int bin=0;
		while(n>0) {
			sum=sum*10+(n%2);
			n/=2;
			
		}
		while (sum>0) {
			bin=(bin*10)+sum%10;
			sum/=10;
		}
		
		System.out.println(bin);
	}
	
	static void decToBinSir(int n) {
		int bin=0;
		int i=1;
		while(n>0) {
			int bit=n%2;
			bin=bit*i+bin;
			i*=10;
			n/=2;
		}
		System.out.println(bin);
	}

}
