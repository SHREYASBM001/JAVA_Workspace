package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	private Node root=null;
	private int count=0;
	
	public boolean add(int key) {
		if(root==null) {
			root=new Node(key);
			count++;
			return true;
		}
		Node curr=root;
		Node prev=null;
		while(curr!=null) {
			if(key<curr.key) {
				prev=curr;
				curr=curr.left;
			}else if(key>curr.key) {
				prev=curr;
				curr=curr.right;
			} else {
				return false;
			}
		}
		if(key<prev.key) {
			prev.left=new Node(key);
			return true;
		}
		else {
			prev.right=new Node(key);
			return true;
		}
	}
	public void traverse() {
		Queue<Node> q=new LinkedList<Node>();
		Node curr=root;
		if(curr!=null) {
			q.offer(root);
		}
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.println(n.key);
			if(n.left!=null) {
				q.offer(n.left);
			}
			if(n.right!=null) {
				q.offer(n.right);
			}
		}
	}
}
