package com.singlelinkedlist;

public class Dem {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(2,100);
		l.remove(0);
		l.reverse();
		//its working yahooo!
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
}
