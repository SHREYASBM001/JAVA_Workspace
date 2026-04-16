package com.stringconcepts;

public class P1 {

	public static void main(String[] args) {
		String s="aaabba3dd3d5567";
		String s1="";
		String temp="";
		int i=0;
		while(i<s.length()) {
			char c=s.charAt(i);
			temp=c+"";
			
			if(!s1.contains(temp)) {
			s1+=(s.length()-(s.replace(temp,"").length()))+""+temp; //for reference how it works
			System.out.println(temp+":"+(s.length()-(s.replace(temp,"").length())));
			}
			i++;
		}
		System.out.println(s1);

	}

}
