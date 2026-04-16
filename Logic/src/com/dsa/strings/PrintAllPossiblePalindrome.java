package com.dsa.strings;

public class PrintAllPossiblePalindrome {
	public static void main(String[] args) {
		String s="malayalam";
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPal(s,i,j)) System.out.println(s.substring(i,j+1));
			}
		}
	}
	static boolean isPal(String s,int i,int j) {
		char[] c=s.toCharArray();
		while(i<j) {
			if(c[i]!=c[j]) return false;
			i++;
			j--;
		}
		return true;
	}

}
