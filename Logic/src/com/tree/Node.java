package com.tree;

public class Node {
	int key;
	Node left;
	Node right;
	
	Node(int k,Node l,Node r){
		key=k;
		left=l;
		right=r;
	}
	Node(int k){
		key=k;
		right=null;
		left=null;
	}
	
}
