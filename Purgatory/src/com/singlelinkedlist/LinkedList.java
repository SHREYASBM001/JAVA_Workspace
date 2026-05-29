package com.singlelinkedlist;

public class LinkedList {
	private Node head=null;
	private int count=0;
	private Node last=null;
	
	public void add(Object o) {
		if(head==null) {
			head=new Node(o,null);
			last=head;
			count++;
			return;
		}
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(o,null);
		last=curr.next;
		count++;
	}
	public int size() {
		return count;
	}
	public void add(int index,Object o) {
		if(index<0 || index>size()-1) {
			throw new IndexOutOfBoundsException();
		}
		if(head==null) {
			head=new Node(o,null);
			last=head;
			count++;
			return;
		}
		if(index==0) {
			head=new Node(o,head);
			count++;
			return;
		}
		Node curr=head;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(o,curr.next);
		count++;
	}
	public void remove(int index) {
		if(index<0 || index>size()-1) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			head=head.next;
			count--;
			return;
		}
		Node curr=head;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public void reverse() {
		if(head==null) {
			throw new NullPointerException();
		}
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	public Object get(int index) {
		if(index<0 || index>size()-1) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=head;
		for(int i=0;i<index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
}
