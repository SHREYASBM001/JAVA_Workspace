package com.p1;

public class PrintPalindromeWordsInSentence {
	public static void main(String [] args ) {
		String s="madam is apple malayalam";
		String[] str=s.split(" ");
		for(String s1:str) {
			if(isPalindrome(s1)) {
				System.out.println(s1);
			}
		}
	}
	static boolean isPalindrome(String s) {
		char[] ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			if(ch[i]!=ch[j]) return false;
			i++;
			j--;
		}
		return true;
	}
}
