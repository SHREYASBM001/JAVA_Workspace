package com.voids;

public class SminString {
	public static void main(String[] args) {
		String s="abbdcdd";
		System.out.println(smin(s));
	}
	static String smin(String s) {
		String s1="";
		String s2="";
		int m1=Integer.MAX_VALUE;
		int m2=Integer.MAX_VALUE;
		while(!s.isEmpty()) {
			char c=s.charAt(0);
			int length=s.length()-s.replace(c+"","").length();
			if(length<m2 && length>m1) {
				m2=length;
				s2=c+"";
			}
			if(length<m1) {
				m2=m1;
				s2=s1;
				m1=length;
				s2=c+"";
			}
			s=s.replace(c+"","");
		}
		return s2+"::"+m2;
	}
}	
