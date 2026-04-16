package com.dsa.strings;

public class HalfReverse {

	public static void main(String[] args) {
		String s="Qspiders";
		char[] ar=s.toCharArray();
		int i=0;
		int j=s.length()/2-1;
		while(i<j) {
			char c=s.charAt(j);
			ar[j]=ar[i];
			ar[i]=c;
			
			i++;
			j--;
		}
		i=s.length()/2;
		j=s.length()-1;
		while(i<j) {
			char c=s.charAt(j);
			ar[j]=ar[i];
			ar[i]=c;
			
			i++;
			j--;
		}
		System.out.println(ar);

	}

}
