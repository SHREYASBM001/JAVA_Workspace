package com.stringbuilder;

public class Intro {

	public static void main(String[] args) {
		// StringBuilder sb=new StringBuilder(null); NPE
		char[] arr= {'a','d','5'};
		StringBuilder sb=new StringBuilder("hello");
		System.out.println(sb);
		
		StringBuilder s=new StringBuilder("");
		s.append(arr);
		System.out.println(s);
		s.append(true);
		System.out.println(s);
		
		StringBuilder sb2=new StringBuilder(32);
		System.out.println(sb2.capacity());
		System.out.println(sb2);
		
		StringBuffer sbu=new StringBuffer("hell");
		sbu.reverse();
		sbu.append("o");
		
		Driver d=new Driver();
		d.drive(sbu);
		
		

	}

}
class Driver {
	void drive(CharSequence c) {
		System.out.println(c.charAt(1));
		System.out.println(c.toString().equals(c.toString()));
		System.out.println(c.subSequence(0,c.length()));
		System.out.println(c.toString());
	}
}
