package com.logica;
import java.util.Scanner;
public class PrintArmStrongInRange {

	public static void main(String[] args) {
	System.out.println("Enter two numbers");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	printArmStrongNumInRange(a,b);

	}
	static void printArmStrongNumInRange(int a,int b) {
		for(int i=a;i<=b;i++) {
			
			if(ArmStrongNumber.isArmStrongNum(i)) {
				System.out.println(i);
			}
	
		}
	}

}
