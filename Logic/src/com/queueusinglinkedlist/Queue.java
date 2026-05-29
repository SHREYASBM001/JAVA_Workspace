package com.queueusinglinkedlist;

public class Queue {
	private Node first=null;
	private int count=0;
	private Node last=null;
	
	public void offer(Object o) {
		if(first==null) {
			first=new Node(o,null);
			last=first;
			count++;
			return;
		}
		
		last.next=new Node(o,null);
		last=last.next;
		count++;
	}
	public Object peek() {
		return first.ele;
	}
	public Object poll() {
		Object e=first.ele;
		first=first.next;
		if(first==null) last=null;
		count--;
		return e;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public int size() {
		return count;
	}
}
