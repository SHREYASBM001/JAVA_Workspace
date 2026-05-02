package com.linkedlist;

public class LinkedList {
	private Node first=null;
	private int count=0;
	
	void add(Object o) {
		if(first==null) {
			first=new Node(o,null);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(o,null);
		count++;
		return;
	}
	void add(int index,Object o) {
		if(index<0 || index>size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		int i=1;
		while(i<=index) {
			curr=curr.next;
			i++;
		}
		Node newnode=new Node(o,null);
		newnode.next=curr.next;
		curr.next=newnode;
	}
	public Object get(int index) {
		if(index<0 || index>size()) {
			throw new IndexOutOfBoundsException();
		}
		int i=1;
		Node curr=first;
		while(i<index) {
			curr=curr.next;
			i++;
		}
		return curr.ele;
	}
	public int size() {
		return count;
	}
}
