package com.logica;
import java.util.Scanner;
public class PrintStrongNumInRange {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	for(int i=a;i<=b;i++) {
		if(StrongNum.isStrongNum(i)) {
			System.out.println(i);
		}
	}

	}

}
