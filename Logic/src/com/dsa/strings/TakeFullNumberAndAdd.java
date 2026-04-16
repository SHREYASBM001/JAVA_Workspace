package com.dsa.strings;

public class TakeFullNumberAndAdd {

	public static void main(String[] args) {
		String s="a123b45c6";
		char[] ar=s.toCharArray();
		int i=0;
		int sum=0;
		int n=0;
		
		while(i<ar.length) {
			
			while(i<s.length() && (ar[i]>='0' && ar[i]<='9')) {
				n=n*10+(ar[i]-'0');
				i++;
			}
			sum+=n;
			n=0;
			i++;
		}
		System.out.println(sum);
	}
		
	}
	
