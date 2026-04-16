package com.dsa.strings;

public class PrintSecondMinOccuredCharacter {

	public static void main(String[] args) {
		String s="jjaaava";
		String s1="";
		String s2="";
		int min=Integer.MAX_VALUE;
		int secondmin=Integer.MAX_VALUE;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			int count=s.length()-s.replace(c+"","").length();
			
			if(count<secondmin && !s1.contains(c+"")) {
				secondmin=count;
				s2=c+"";
			}
			if(count<min) {
				secondmin=min;
				min=count;
				s2=s1;
				s1=c+"";
			}
		}
		System.out.println(s2+":"+secondmin);
		System.out.println(s1+":"+min);
	}

}
