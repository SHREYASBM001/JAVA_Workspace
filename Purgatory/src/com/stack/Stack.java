package com.stack;

public class Stack {
	private Object[] arr;
	private int count=0;
	
	public Stack() {
		arr=new Object[5];
	}
	public void push(Object o) {
		if(count>=arr.length) {
			increaseSize();
		}
		arr[count++]=o;
		return;
	}
	public Object pop() {
		Object temp=arr[--count];
		arr[count]=null;
		return temp;
	}
	public Object peek() {
		return arr[count-1];
	}
	public void increaseSize() {
		Object temp[]=new Object[arr.length+arr.length/2];
		int i=0;
		while(i<arr.length) {
			temp[i]=arr[i];
			i++;
		}
		arr=temp;
	}
}
