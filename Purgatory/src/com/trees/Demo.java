package com.trees;

public class Demo {
	public static void main(String[] args) {
		Tree t=new Tree();
		System.out.println(t.add(10));
		System.out.println(t.add(20));
		System.out.println(t.add(5));
		System.out.println(t.add(10));
		t.traverse();
	}
}
