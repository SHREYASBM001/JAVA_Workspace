package com.logica;
import java.util.Scanner;
public class PrintAutomorphicInRange {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	printAutomorphicInRange(a,b);
	}
	static void printAutomorphicInRange(int a,int b){
		for(int i=a;i<=b;i++) {
			if(AutoMorphic.isAutoMorphic(i)) {
				System.out.println(i);
			}
		}
	}

}
