package com.voids;

import java.util.HashMap;

public class LongestPalindromeThatCanBeBuild3 {
	public static void main(String[] args) {
		String s="baaabd";
		System.out.println(check(s));
	}
	public static int check(String s) {
		int size=0;
		boolean flag=true;
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			h.put(ch[i],s.length()-s.replace(ch[i]+"","").length());
		}
		int j=0;
		while(!h.isEmpty() && j<ch.length) {
			int temp=0;
			try {
			temp=h.remove(ch[j]);
			} catch(NullPointerException e) {
				j++;
			}
			
			if(temp%2==0) {
				size+=temp;
			} else {
				size+=temp-1;
				flag=false;
			}
			j++;
		}
		if(!flag) size++;
		return size;
	}
}
