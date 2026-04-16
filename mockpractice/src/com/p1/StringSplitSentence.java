package com.p1;

public class StringSplitSentence {

	public static void main(String[] args) {
		String s="JAVA IS EASY";
		char[] ch=s.toCharArray();
		String[] str=s.split(" ");
		for(String s1:str) {
			System.out.println(s1);
		}

	}

}
