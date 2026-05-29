package com.linkedlist;

public class Demo2 {

	public static void main(String[] args) {
	LL l=new LL();
	l.add(10);
	l.add(20);
	l.add(30);
	
	l.add(2,100);
	l.remove(2);
	l.reverse();
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}

	}

}
