package com.voids;

public class LongestPalindromeThatCanBeBuild {
	public static void main(String[] args) {
		String s = "baaabd";
		System.out.println(check(s));
	}
	public static int check(String s) {
		int size=0;
		boolean oddFound=true;
		while(!s.isEmpty()) {
			int count=s.length()-s.replace(s.charAt(0)+"","").length();
			if(count%2==0) {
				size+=count;
				s=s.replace(s.charAt(0)+"", "");
			}else {
				size+=count-1;
				s=s.replace(s.charAt(0)+"","");
				oddFound=false;
			}
		}
		if(!oddFound) size++;
		return size;
		
	}
}
