package com.stringbuilder;

public class P1 {

	public static void main(String[] args) {
		CharSequence c="Hello";
		StringBuilder sb=new StringBuilder(c);
		sb.reverse();

		sb.insert(1, "fux");
		System.out.println(sb);

		sb.setCharAt(1, 's');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(10);
		System.out.println(sb.length());
		System.out.println(sb.subSequence(1, 4));
		System.out.println(sb.indexOf("s",5));
		System.out.println(sb.delete(1,4));
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb);
		System.out.println(sb.length());
		sb.trimToSize();
		System.out.println(sb.length());
		
		//Strings below (immuatble)
		String s="helllo";
		System.out.println(s.replace("lo", ""));
		System.out.println(s);
	}

}
