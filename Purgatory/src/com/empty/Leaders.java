package com.empty;

public class Leaders {
	public static void main(String[] args) {
		int [] a= {16,17,3,5,2};
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					flag=false;
					break;
				}
			}
			if(flag) System.out.println(a[i]);
		}
	}
}
