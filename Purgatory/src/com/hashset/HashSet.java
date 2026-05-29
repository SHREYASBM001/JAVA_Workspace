package com.hashset;

public class HashSet {
	private Node[] arr;
	private int count=0;
	HashSet(){
		arr=new Node[10];
	}
	public boolean add(Object o) {
		int index=hash(o);
		if(arr[index]==null) {
		arr[index]=new Node(o,null);
		count++;
		return true;
		}
		Node curr=arr[index];
		Node prev=null;
		while(curr!=null) {
			if(curr.ele.equals(o)) {
				return false;
			}
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(o,null);
		count++;
		return true;
	} 
	public int hash(Object o) {
		return o.hashCode()%arr.length;
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
			Node curr=arr[i];
			while(curr!=null) {
				System.out.println(curr.ele);
				curr=curr.next;
			}
		}
	}
	public boolean remove(Object o) {
		int index=hash(o);
		if(arr[index]==null) return false;
		
		Node curr=arr[index];
		while(curr!=null) {
			if(curr.ele.equals(o)) {
				curr.next=curr.next.next;
				count--;
				return true;
			}
		}return false;
		
	}
	
	
}
