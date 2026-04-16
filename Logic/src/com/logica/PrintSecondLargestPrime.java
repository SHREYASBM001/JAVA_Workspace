package com.logica;
import java.util.Scanner;
public class PrintSecondLargestPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("BY using my silly logic:"+printSecondLargestPrime(n));
		System.out.println("BY using count:"+printSecondLargestPrime2(n));
	}
static int printSecondLargestPrime(int n) {
	 if(n<2) {
		 System.out.println("Invalid number");
		 return 0;

	 } 
	 int i=n;
	 int m=0;	 
	 	 while(i<=n && i>1) {
		 boolean flag=true;
		 int j=2;
		 while(j<=i/2) {
			 if(i%j==0) {
				 flag=false;
				 
			 }
			 j++;
		 }
		 if(flag) m+=i;
		 if(flag && m!=i) return i;
		 i--;
	 }
	 return 0;
	
}
static int printSecondLargestPrime2(int n) {
	 if(n<2) {
		 System.out.println("Invalid number");
		 return 0;

	 } 
	 int i=n;
	 int count=0;	 
	 	 while(i<=n && i>1) {
		 boolean flag=true;
		 int j=2;
		 while(j<=i/2) {
			 if(i%j==0) {
				 flag=false;
				 
			 }			 j++;
		 }
		 
		 if(flag) {
			 count++;
			 if(count==2) return i;
		 }
		 i--;
	 }
	 return 0;
	
}
}
