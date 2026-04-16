package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintSuccessiveCharacters {

	public static void main(String[] args) {
		String s="ssuccesss";
		String e="([a-z])\\1+";
		Pattern p=Pattern.compile(e);
		Matcher m=p.matcher(s);
		
		while(m.find()) {
			String s1=m.group();
			System.out.println(s1.length()+":"+m.group());
		}

	}

}
