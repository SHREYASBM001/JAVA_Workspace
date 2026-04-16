package com.wrapperclass;

public class WrapperParseMethods {
	public static void main(String[] args) {
		String s="true";
		String s1="10";
		String s2="10.5";
		String s3="10.5f";
		String s4="C";
		
		boolean b1=Boolean.parseBoolean(s);
		int i=Integer.parseInt(s1);
		double d=Double.parseDouble(s2);
		float f=Float.parseFloat(s3);
	//	char c=Character.parseCharacter(s4); //character Wrapper class doesn't have parse method
	// int i=Double.parseDouble(s2); //Type mismatch error
		
		System.out.println(b1);
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		
	}

}
