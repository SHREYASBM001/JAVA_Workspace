package com.dsa.strings;

public class PanagramRecursion {

	public static void main(String[] args) {
	String s="abcdefghijklmnopqrstuvwxyz";
	System.out.print(isPanagram(s.toLowerCase(),'z'));
	}
	
	static boolean isPanagram(String s,char c) {
		if(s.length()<26) return false;
		if(!(s.contains(c+""))) {
			return false;
		}
		if(c=='a')return true;
		
		
		return isPanagram(s,c--);
	}

}
