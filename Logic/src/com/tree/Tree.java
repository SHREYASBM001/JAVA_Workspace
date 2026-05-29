package com.tree;

import java.util.LinkedList;
import java.util.Queue;



public class Tree {
	private Node root=null;
	private int count;
	private int prevcount=0;
	
	public boolean add(int key) {
		if(root==null) {
			root=new Node(key);
			prevcount=count;
			count++;
			return true;
		}
		Node curr=root;
		Node prev=null;
		while(curr!=null) {
			if(key<curr.key) {
				prev=curr;
				curr=curr.left;
			}
			else if(key>curr.key) {
				prev=curr;
				curr=curr.right;
			}
			else {
				return false;
			}
		}
		if(key<prev.key) {
			prev.left=new Node(key);
		}
		else {
			prev.right=new Node(key);
		}
		count++;
		return true;
	}
	public void traverse() {
	
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null) q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.key);
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
			if(!q.isEmpty())System.out.print(",");
		}
	}
}
