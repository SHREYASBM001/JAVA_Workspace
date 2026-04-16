package com.dsa.strings;

public class CountNumberOfAphabetsNumbersSpecialCharacter {

	public static void main(String[] args) {
		String s="#*^&%#hello1342JGG9709";
		int ap=0;
		int nm=0;
		int sp=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
				ap++;
			}
			else if(ch>='0' && ch<='9') {
				nm++;
			}
			else {
				sp++;
			}
		}
		System.out.println("Alphabets:"+ap+"\nNumbers:"+nm+"\nSpecial Characters:"+sp);

	}

}
