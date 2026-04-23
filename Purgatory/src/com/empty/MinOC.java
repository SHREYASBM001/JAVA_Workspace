package com.empty;

public class MinOC {

	public static void main(String[] args) {
		System.out.println(minOC("jaaavva"));

	}
	static String minOC(String s) {
		String s1="";
		int max=s.length();
		int i=0;
		while(i<s.length()) {
			char c=s.charAt(i);
			int count=s.length()-s.replace(c+"","").length();
			if(count<max) {
				s1=c+"";
				max=count;
			}
			i++;
		}
		return s1+":"+max;
	}
}	
