package com.Queue;

public class Queue {
	private Node head=null;
	private int count=0;
	private Node last=null;
	
	public void offer(Object o) {
		if(head==null) {
			head=new Node(o);
			last=head;
			count++;
			return;
		}
		last.next=new Node(o);
		last=last.next;
		count++;
	}
	public int size() {
		return count;
	}
	public Object peek() {
		if(head==null) return null;
		return head.ele;
	}
	public Object poll() {
		if(head==null) {
			return null;
		}
		Object temp=head.ele;
		head=head.next;
		if(head==null) last=null;
		return temp;
	}
}
