package com.voids;

public class ENCDEC {
	public static void main(String[] args) {
		String s="helloHHHLZ66812%&*";
		String s1=ENC(s,2);
		System.out.println(ENC(s,2));
		System.out.println(DEC(s1,2));
	}
	public static String ENC(String s,int n) {
		int i=0;
		char[] ch=s.toCharArray();
		while(i<ch.length) {
			char c=ch[i];
			if(Character.isUpperCase(c)) {
				ch[i]=(char)((((c-'A'+n)%26)+26)%26+'A');
			} else if(Character.isLowerCase(c)) {
				ch[i]=(char)((((c+n-'a')%26)+26)%26+'a');
			}
			else if(c>='0' && c<='9') {
				ch[i]=(char)((((c+n-'0')%10)+10)%10+'0');
			} else {
				ch[i]=(char)c;
			}
			i++;
		}
		return new String(ch);
	}
	public static String DEC(String s,int n) {
		return ENC(s,-n);
	}
}
