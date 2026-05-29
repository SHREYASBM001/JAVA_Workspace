package com.voids;

public class SmaxString {
		public static void main(String[] args) {
			String s="abbbaadd";
			System.out.println(smax(s));
			
		}
		static String smax(String s) {
			String s1="";
			String s2="";
			int m1=Integer.MIN_VALUE;
			int m2=Integer.MIN_VALUE;
			int i=0;
			while(!s.isEmpty()) {
				char c=s.charAt(0);
				int length=s.length()-s.replace(c+"","").length();
				if(m2<length && length<m1) {
					s2=c+"";
					m2=length;
				}
				if(m1<length) {
					m2=m1;
					s2=s1;
					s1=c+"";
					m1=length;
				}
				s=s.replace(c+"","");
			}
			return s2+":"+m2;
		}
}
