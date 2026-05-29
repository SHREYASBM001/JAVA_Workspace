package com.voids;

public class MaxString {
	public static void main(String[] args) {
		String s="aanbcccsd";
		System.out.println(max(s));
	}
	static String max(String s) {
		String s1="";
		int max=Integer.MIN_VALUE;
		int i=0;
		while(i<s.length()) {
			char c=s.charAt(i);
			int length=s.length()-s.replace(c+"","").length();
			if(length>max) {
				s1=c+"";
				max=length;
			}
			i++;
		}
		return s1+":"+max;
	}
}
