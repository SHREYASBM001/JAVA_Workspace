package com.logica;
import java.util.*;

public class CheckPrime {
	public static void main(String [] args) {
System.out.print("Enter a number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

if(isPrime(n)) System.out.println("The num is Prime");
else System.out.println("Not a Prime Number");
sc.close();
}
	static boolean isPrime(int n) {
		if (n<2) return false;
		for(int i=2;i<=n/2;i++) {
		
		if(n%i==0) {
		return false;
		}
		}
		return true;
	}
}
