package com.doublylinkedlist;

public class DoublyLinkedList {
	private Node head=null;
	private Node last=null;
	private int count=0;
	
	public void add(Object o) {
		if(head==null) {
			head=new Node(o);
			last=head;
			count++;
			return;
		}
		Node curr=head;
		Node prev=null;
		while(curr.next!=null) {
			prev=curr;
			curr=curr.next;
		}
		curr.next=new Node(o,prev,null);
		count++;
	}
	public void add(int index,Object o) {
		if(index<0 || index>size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			new Node(o,null,head);
			count++;
			return;
		}
		Node curr=head;
		Node prev=null;
		for(int i=1;i<index;i++) {
			prev=curr;
			curr=curr.next;
		}
		Node temp=curr.next;
		curr.next=new Node(o,curr,curr.next);
		if(curr.next!=null)
		temp.prev=curr.next;
		count++;
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
		curr.next=curr.next.next;
		curr.prev=curr;
		count--;
		
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
