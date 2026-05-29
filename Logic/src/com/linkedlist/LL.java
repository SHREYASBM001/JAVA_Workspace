package com.linkedlist;

public class LL {
	Node first=null;
	int count=0;
	Node last=null;
	
	public void add(Object o) {
		if(first==null) {
			first=new Node(o,null);
			last=first;
			count++;
			return;
		}
		Node newnode=new Node(o,null);
		last.next=newnode;
		last=newnode;
		count++;
	}
	public void add(int index,Object o) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first= new Node(o,first);
			
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		Node newnode=new Node(o,curr.next);
		curr.next=newnode;
		count++;
	}
	public void remove(int index) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public void reverse() {
		Node prev=null;
		Node curr=first;
		Node next=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		Node temp=first;
		first=prev;
		last=temp;
	}
	
	public Object get(int index) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=0;i<index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public int size() {
		return count;
	}
	
}
