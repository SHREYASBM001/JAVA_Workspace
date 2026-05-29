package com.stackusingarraylist;

import java.util.EmptyStackException;

public class Stack {
	private Object[] arr;
	private int x=0;
	
	public Stack(){
		arr=new Object[5];
	}
	
	public void push(Object o) {
		if(x>=arr.length) {
			increaseSize();
		}
		arr[x++]=o;
	}
	private void increaseSize() {
		Object[] temp=new Object[arr.length+arr.length/2];
		
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
	}
	public boolean isEmpty() {
		return x==0;
	}
	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return arr[x-1];
	}
	public int size() {
		return x;
	}
	public Object pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Object o=arr[--x];
		arr[x]=null;
		return o;
	}
	
}
