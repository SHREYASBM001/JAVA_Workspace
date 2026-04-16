package com.logica;
import java.util.*;
public class PrintPrime {
	public static void main(String [] args) {
System.out.print("Enter a NUM: ");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
printPrime(a);
}
static void printPrime(int a) {
	int i=2;
	int j=1;
	while (i<=a) {
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

