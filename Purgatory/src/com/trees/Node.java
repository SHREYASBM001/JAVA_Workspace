package com.trees;

public class Node {
	int key;
	Node left;
	Node right;
	 
	public Node(int e,Node l,Node r) {
	key=e;
	left=l;
	right=r;
	}
	public Node(int e) {
		key=e;
		left=null;
		right=null;
	}
}
