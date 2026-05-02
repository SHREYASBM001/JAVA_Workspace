package com.dsa.arraylist;

public class ArrayList {
	Object[] a;
	int x=0;
	
	ArrayList(){
		a=new Object[5];
	}
	
	void add(Object o) {
		if(x>=a.length) {
			increaseSize();
		}
		a[x]=o;
		x++;
		
	}
	
	void increaseSize() {
		Object[] temp=new Object[a.length*2];
		
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	void decreaseSize() {
		Object[] temp=new Object[x];
		for(int i=0;i<temp.length;i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	
	void add(int index,Object o) {
		if(index<0 || index>=x) {
			throw new IndexOutOfBoundsException();
		}
		if(index==x-1) increaseSize();
		for(int i=x-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=o;
		x++;
	}
	void remove(int index) {
		if(index<0 || index>=x) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=index;i<=x-2;i++) {
			a[i]=a[i+1];
		}
		x--;
		decreaseSize();
	}
	
	Object get(int index) {
		if(index<0 || index>=x) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	int size() {
		return x;
	}
	
	
}
