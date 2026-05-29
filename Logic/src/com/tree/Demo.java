package com.tree;

public class Demo {

	public static void main(String[] args) {
		Tree t=new Tree();
		t.add(10);
		System.out.println(t.add(12));
		t.add(8);
		t.add(9);
		t.add(7);
		t.traverse();

	}

}
