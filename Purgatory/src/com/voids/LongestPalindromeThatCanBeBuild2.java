package com.voids;

public class LongestPalindromeThatCanBeBuild2 {
	public static void main(String[] args) {
		String s = "baaabd";
		System.out.println(check(s));
	}
	public static int check(String s) {
		int[] freq=new int[256];
		int size=0;
		boolean flag=true;
		char[] ch=s.toCharArray();
		for(char c:ch) {
			freq[c]++;
		}
		for(int b: freq) {
			if(b%2==0) {
				size+=b;
			} else
			{
				size+=b-1;
				flag=false;
			}
		}
		if(!flag) size++;
		return size;
	}
}

