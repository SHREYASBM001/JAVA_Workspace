package com.p1;

public class PrintSuccessiveCharacter {

	public static void main(String[] args) {
		String s="success";
		char[] ch=s.toCharArray();
		String s1="";
		int i=0;
		while(i<ch.length) {
			char c=ch[i];
			i++;
			while(i<ch.length && ch[i]==c) {
				s1+=""+c+ch[i];
				i++;
			}
			System.out.println(s1);
			s1="";
		}

	}

}
