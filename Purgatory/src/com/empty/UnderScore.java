package com.empty;

public class UnderScore {

	public static void main(String[] args) {
		System.out.println(under("shreyease"));

	}

	static String under(String s) {
		int i=0;
		String vowels="aeiou";
		while(i<vowels.length()) {
			char c=vowels.charAt(i);
			int count=s.length()-s.replace(c+"", "").length();
			if(count>2) {
				s=s.replace(c+"","_");
			}
			
			i++;
		}
		return s;
	}
}
