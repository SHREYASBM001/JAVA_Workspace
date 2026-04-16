package com.wrapperclass;

public class Wrapper {

	public static void main(String[] args) {
		int i=10;
		Integer a=i; //auto boxing // a=10
		Integer b=Integer.valueOf(i); //Explicit(before JDK 1.5,now its implicit) :) // b=10
		
		System.out.println("Primitive int: "+i);
		System.out.println("Wrapper (Non Primitive) Interger: "+a);
		System.out.println("Wrapper (Non Primitive) Interger: "+b);
		
		int j=a; //Auto Un-boxing
		int k=(int)b; //Explicit Un-boxing //OR
		int l=a.intValue();  //Explicit Un-boxing 
		
		System.out.println("Primitive int: "+j);
		System.out.println("Primitive int: "+k);

	}

}
