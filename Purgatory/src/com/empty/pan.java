package com.empty;

public class pan {

	public static void main(String[] args) {
		System.out.println(is("abcdefghijklmnopqrstuvwxyz",'a'));

	}
	static boolean is(String s,char c) {
		if(!s.contains((char)c+"")) return false;
		if((char)c==(char)'z') return true;
		return is(s,++c);
	}
}
