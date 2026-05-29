package com.linkedlist;

public class Demo {

	public static void main(String[] args) {
//		Node n=new Node(10,null);
//		n.next=new Node(20,null);
//		n.next.next=new Node(30,null);
//		
//		System.out.println(n.ele);
//		System.out.println(n.next.ele);
//		System.out.println(n.next.next.ele);
//		
//		System.out.println("___________");
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(70);
		l.add(30);
		l.add(30);
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("size:"+l.size());
		System.out.println("After Adding 100 at 0 index");
		System.out.println("----------------------------");
		
		l.add(0,100);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("size:"+l.size());
		System.out.println("After Removing at 0 index");
		System.out.println("----------------------------");
		l.add(100);
		
		l.remove(0);
		
		for(int i=0;i<=l.size()-1;i++) {
			System.out.println(l.get(i));
		}
		
		
		System.out.println("size:"+l.size());
		System.out.println("---------------END---------------");
		System.out.println("---------------REVERSE TESTS---------------");
		
		l.reverse();
		for(int i=0;i<=l.size()-1;i++) {
			System.out.println(l.get(i));
		}
		l.add(1000);
		System.out.println("_____________");
		for(int i=0;i<=l.size()-1;i++) {
			System.out.println(l.get(i));
		}
		System.out.println("---------------NEW REMOVE TESTS---------------");
		l.remove(3);
		l.remove(2);
		l.remove(1);
		l.remove(0);
		
		System.out.println("size:"+l.size());
		System.out.println("After Removing all index");
		System.out.println("----------------------------");
		
		for(int i=0;i<=l.size()-1;i++) {
			System.out.println(l.get(i));
		}
		
		
		
		
//		System.out.println(l.get(0));
//		System.out.println(l.get(1));
//		System.out.println(l.get(2));
//		System.out.println(l.get(3));
	}

}
