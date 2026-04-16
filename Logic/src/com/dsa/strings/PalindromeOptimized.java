package com.dsa.strings;

public class PalindromeOptimized {

	public static void main(String[] args) {
		String s="malayalam";
		int i=0;
		int j=s.length()-1;
		boolean flag=true;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag=false;
			
			} 
			i++;
			j--;
		}
		if(flag) System.out.println(s+ " is a palindrome ");
		else System.out.println(s+" is not a palindrome");

	}

}
