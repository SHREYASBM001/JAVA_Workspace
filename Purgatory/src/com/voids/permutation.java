package com.voids;

public class permutation {
		
	public static void main(String[] args) {
		String s="abc";
		perm(s,0,s.length()-1);
	}
	public static void perm(String s,int st,int end) {
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
		char c=ch[i];
		ch[i]=ch[j];
		ch[j]=c;
		return new String(ch);
	}
}
