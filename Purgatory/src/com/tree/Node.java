package com.tree;

public class Node {
	int key;
	Node left;
	Node right;
	
	Node(int key){
		this.key=key;
		left=null;
		right=null;
	}
	Node(int k,Node l,Node r)
	{
		key=k;
		left=l;
		right=r;
	}
}
