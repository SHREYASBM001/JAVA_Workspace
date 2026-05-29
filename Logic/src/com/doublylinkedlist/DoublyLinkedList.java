package com.doublylinkedlist;

import com.sun.media.sound.RIFFInvalidDataException;

public class DoublyLinkedList {
	Node first=null;
	int count=0;
	Node last=null;
	
	public void add(Object o) {
		if(first==null) {
			first=new Node(o,null,null);
			last=first;
			count++;
			return;
		}
		
		Node newnode=new Node(o,last,null);
		last.next=newnode;
		last=newnode;
		count++;
	}
	public void add(int index,Object o) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			Node newnode=new Node(o,null,first);
			first.prev=newnode;
			first=newnode;
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		Node newnode=new Node(o,curr,curr.next);
		curr.next=newnode;
		count++;
		return;
	}
	public void remove(int index) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			first.prev=null;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		if(curr.next.next!=null) curr.next=curr.next.next;
		
		curr.next.prev=curr;
		count--;
		
	}
	public void reverse() {
		Node prev=null;
		Node curr=first;
		Node next=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
		}
		Node temp=curr;
		first=prev;
		last=curr;
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
