package com.doublelinkedlst;

public class Demo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
//		l.remove(0);
//		l.add(5,100);
		l.reverse();
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
}
