package com.Queue;

public class Node {
	Object ele;
	Node next;
	
	Node(Object ele,Node next){
		this.ele=ele;
		this.next=next;
	}
	public Node(Object ele) {
		this.ele=ele;
		next=null;
	}
}
