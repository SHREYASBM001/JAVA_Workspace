package com.doublylinkedlist;

public class Node {
	Object ele;
	Node prev;
	Node next;
	
	Node(Object o){
		ele=o;
		prev=null;
		next=null;
	}
	Node(Object o,Node p,Node n){
		ele=o;
		prev=p;
		next=n;
	}
}
