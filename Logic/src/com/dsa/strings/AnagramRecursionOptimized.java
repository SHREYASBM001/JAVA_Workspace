package com.dsa.strings;

public class AnagramRecursionOptimized {

	public static void main(String[] args) {
		System.out.println(isAnagram("listen","silent"));
	}
	static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		if(s1.length()==0 && s2.length()==0) return true;
		
		String s3=s1.replace(s1.charAt(0)+"","");
		String s4=s2.replace(s1.charAt(0)+"","");
		return isAnagram(s3,s4);
		
	}
}
