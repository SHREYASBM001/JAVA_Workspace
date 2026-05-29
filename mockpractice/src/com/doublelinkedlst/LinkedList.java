package com.doublelinkedlst;

public class LinkedList {
	private Node head=null;
	private int count=0;
	private Node last=null;
	
	public void add(Object o) {
		if(head==null) {
			head=new Node(o);
			count++;
			last=head;
			return;
		}
		last.next=new Node(o,last,null);
		last=last.next;
		count++;
	}
	public void add(int index,Object o) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			head=new Node(o,null,head);
			count++;
			return;
		}
		Node curr=head;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(o,curr,curr.next);
		count++;
	}
	public void remove(int index) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			head=head.next;
			head.prev=null;
			count--;
			return;
		}
		Node curr=head;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		Node next=curr.next.next;
		Node n=curr;
		curr.next=next;
		curr.prev=n;
		count--;
	}
	public void reverse() {
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	public Object get(int index) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=head;
		for(int i=0;i<index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public int size() {
		return count;
	}
}
