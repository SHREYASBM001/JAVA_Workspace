package com.dsa.strings;

public class CountRepeatedCharacters {
/*
 * input:"hello world"
 * output:"he121 w2r3d"
 * */
	public static void main(String[] args) {
		String s="hello world";
		int i=0;
		int count=0;
		String s1=s;
		char[] ch=s.toCharArray();
		while(i<s.length()) {
			count=0;
			char c=s.charAt(i);
			for(int j=1;j<s.replace(c+"","").length();j++) {
				count++;
			}
			
			ch[i]=(char)count;
			
			
			i++;
		}
		System.out.println(new String(ch));

	}

}
