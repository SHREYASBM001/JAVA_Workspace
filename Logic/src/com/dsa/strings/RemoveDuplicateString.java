package com.dsa.strings;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String s="java is a very very easy easy java";
		String[] str=s.split(" ");
		String s1="";
		int i=0;
		while(i<str.length) {
			if(!(s1.contains(" "+str[i]+" "))) {
				s1+=" "+str[i]+" ";
			}
			i++;
		}
		System.out.println(s1.trim());

	}

}
