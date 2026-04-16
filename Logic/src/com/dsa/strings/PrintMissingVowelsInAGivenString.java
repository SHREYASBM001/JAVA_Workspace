package com.dsa.strings;

public class PrintMissingVowelsInAGivenString {

	public static void main(String[] args) {
		String s="india";
		s=s.toLowerCase();
		String vowels="aieou";
		String notPresent="";
		
		
		for(int i=0;i<vowels.length();i++) {
			char c=vowels.charAt(i);
			
			if(!s.contains(c+"")) {
				//notPresent+=c+" ";
				
				System.out.println(c+"");
			}
		}
		// System.out.println(notPresent);
	}

}
