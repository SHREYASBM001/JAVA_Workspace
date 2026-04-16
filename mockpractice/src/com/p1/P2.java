package com.p1;

public class P2 {

	public static void main(String[] args) {
		String s="aaabbbcdde111h2b";
		char[] ch=s.toCharArray();
		String s1="";
		int count=1;
		int i=0;
		while(i<ch.length) {
			char temp=ch[i];
			i++;
			while(i<ch.length && ch[i]==temp) {
				count++;
				i++;
			}
			s1+=count+":"+temp+" ";
			count=1;
		}
		System.out.println(s1);

	}

}
