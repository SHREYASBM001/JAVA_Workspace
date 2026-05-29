package com.voids;

public class minString {

	public static void main(String[] args) {
		String s="abbaa";
		System.out.println(smin(s));
	}
	public static String smin(String s) {
		String s1="";
		int min=Integer.MAX_VALUE;
		while(!s.isEmpty()) {
			char c=s.charAt(0);
			int length=s.length()-s.replace(c+"","").length();
			if(length<min) {
				s1=c+"";
				min=length;
			}
			s=s.replace(c+"","");
		}
		return s1+":"+min;
	}

}
