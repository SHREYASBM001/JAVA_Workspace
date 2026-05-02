package com.linkedlist;

public class Demo {

	public static void main(String[] args) {
		Node n=new Node(10,null);
		n.next=new Node(20,null);
		n.next.next=new Node(30,null);
		
		System.out.println(n.ele);
		System.out.println(n.next.ele);
		System.out.println(n.next.next.ele);
		
		System.out.println("___________");
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(0,70);
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
	}

}
