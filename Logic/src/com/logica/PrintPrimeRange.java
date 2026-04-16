package com.logica;
import java.util.*;
public class PrintPrimeRange {
public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range:");
int a=sc.nextInt();
int b=sc.nextInt();
printPrimeRange(a,b);
}
static void printPrimeRange(int a,int b) {
	 if(a==0) a+=2;
	 if(a==1) a+=1;
		
	 int i=a;
	
	int j=2;
	while (i<=b) {
		boolean flag=true;
		while(j<=i/2) {
		if(i<2 ) {
			flag=false;
			break;
		}
		if(i%j==0 && j!=1) {
			flag=false;
			break;
		}
		
		j++;
		}
		if(flag) System.out.println(i);
	i++;
	}
	}
}
