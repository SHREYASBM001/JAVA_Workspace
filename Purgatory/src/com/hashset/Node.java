package com.hashset;

public class Node {
	Object ele;
	Node next;
	
	Node(Object e,Node n)
	{
		ele=e;
		next=n;
	}
	
	@Override
	public boolean equals(Object o) {
		Node n=(Node)o;
		return this.ele==n.ele;
	}
	@Override
	public int hashCode() {
		
		return (int)ele%10;
	}
	
}
