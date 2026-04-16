package com.dsa.strings;

public class AnagramRecursion {

	public static void main(String[] args) {
		System.out.println(isAnagram("silent","listen"));

	}

	static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		if(s1.length()==0 && s2.length()==0) return true;
		return isAnagram(s1.replace(s1.charAt(0)+"",""),s2.replace(s1.charAt(0)+"", ""));
		
	}
}
