package com.p1;

public class TakeFullNumberAndAdd {

	public static void main(String[] args) {
		String s="a123b45c6";
		char[] c=s.toCharArray();
		int sum=0;
		int n=0;
		int i=0;
		while(i<c.length) {
			while(i<c.length && (c[i]>='0' && c[i]<='9')) {
				n=n*10+(c[i]-'0');
				i++;
			}
			i++;
			sum+=n;
			n=0;
		}
		System.out.println(sum);

	}

}
