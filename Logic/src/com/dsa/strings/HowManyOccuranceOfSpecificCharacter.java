package com.dsa.strings;

public class HowManyOccuranceOfSpecificCharacter {

	public static void main(String[] args) {
		String s="developer";
		char c='e';
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(s+" Has "+count+" occurance of character "+c);
	}

}
