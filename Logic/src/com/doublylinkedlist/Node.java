package com.doublylinkedlist;

public class Node {
	Object ele;
	Node prev;
	Node next;
	
	Node(Object o,Node pre,Node nex){
		ele=o;
		prev=pre;
		next=nex;
	}
}
