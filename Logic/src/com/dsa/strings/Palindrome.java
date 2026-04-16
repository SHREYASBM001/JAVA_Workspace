package com.dsa.strings;

public class Palindrome {

	public static void main(String[] args) {
		String s="malayalam";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		System.out.println(s.equals(s1));

	}

}
