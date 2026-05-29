package com.doublylinkedlist;

public class Demo {

	public static void main(String[] args) {
		DoublyLinkedList d=new DoublyLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		
		d.add(0,100);
		d.remove(3);
		
		d.reverse();
		for(int i=0;i<d.size();i++) {
			
			System.out.println(d.get(i));
		}

	}

}
