package com.voids;

public class LongestSubstringWithoutRepeatingCharacter {
	 public static void main(String[] args) {
		String s="abcc";
		System.out.println(longestSubstringWithoutRepeatingCharacter(s));
	}
	 public static String longestSubstringWithoutRepeatingCharacter(String s) {
		 String s1="";
		 String s2="";
		 int l=0;
		 int i=0;
		 while(i<s.length()) {
			 char c=s.charAt(i);
			 while(s1.contains(c+"")) {
				 s1=s1.substring(1);
			 }
			 s1+=c+"";
			 if(l<s1.length()) {
				 l=s1.length();
				 s2=s1;		 
			 }
			 i++;
		 }
		 return s2;
	 }
}
