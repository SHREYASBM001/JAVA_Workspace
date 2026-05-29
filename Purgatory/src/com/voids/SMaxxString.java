package com.voids;

public class SMaxxString {
	public static void main(String[] args) {
		String s="aaabbbbadd";
		System.out.println(smax(s));
	}
	public static String smax(String s) {
		String s1="";
		String s2="";
		int m1=0;
		int m2=0;
		while(!s.isEmpty()) {
			char c=s.charAt(0);
			int length=s.length()-s.replace(c+"", "").length();
			if(length>m2 && length<m1) {
				m2=length;
				s2=c+"";
			}
			if(length>m1) {
				m2=m1;
				s2=s1;
				s1=c+"";
				m1=length;
			}
			s=s.replace(c+"","");
		}
		return s2+":"+m2;
	} 
}
