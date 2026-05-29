package com.voids;

public class Perm {
	public static void main(String[] args) {
		perm("abc",0,2);
	}
	static void perm(String s,int st,int end) {
		if(st==end) {
			System.out.println(s);
		}
		for(int i=st;i<=end;i++) {
			String s1=swap(s,st,i);
			perm(s1,st+1,end);
		}
	}
	public static String swap(String s,int i,int j) {
		char[] ch=s.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return new String(ch);
	}
}
