package com.linkedlist;

public class LinkedList {
	private Node first=null;
	private int count=0;
	private Node last=null;
// O(n) time taken depends on number of elements
//	void add(Object o) {
//		if(first==null) {
//			first=new Node(o,null);
//			count++;
//			return;
//		}
//		Node curr=first;
//		while(curr.next!=null) {
//			curr=curr.next;
//		}
//		Node newnode=new Node(o,null);
//		curr.next=newnode;
//		count++;
//		return;
//		
//	}
	//O(1) code constant time
	void add(Object o) {
		if(first==null) {
			first=new Node(o,null);
			last=first;
			count++;
			return;
		}
		Node curr=new Node(o,null);
		last.next=curr;
		last=curr;
		count++;
		return;
	}
	void add(int index,Object o) {
		if(index<0 || index>size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index==0) {
			first=new Node(o,first);
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		Node newnode=new Node(o,null);
		newnode.next=curr.next;
		curr.next=newnode;
		count++;
		return;
	}
	void remove(int index) {
		
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		
		Node curr1=first;
		Node curr2=null;
		if(index==0) {
			first=curr1.next;
			count--;
			return;
		}
        
		for(int i=0;i<index;i++) {
			curr2=curr1;
			curr1=curr1.next;
		}
		curr2.next=curr1.next;
		count--;
		return;
		
	}
	Object get(int index) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=0;i<index;i++) {
			curr=curr.next;			
		}
		return curr.ele;
	}
	int size() {
		return count;
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
		last = temp;
		
		
	}
}
