package com.p1;

public class ReverseSentence {

	public static void main(String[] args) {
		String s="JAVA is a very very EASY";
		String s1="";
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			s1+=str[i]+" ";
		}
		System.out.println(s1.trim());

	}

}
