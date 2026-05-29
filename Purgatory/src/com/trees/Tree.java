package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	private Node root=null;
	private int count=0;
	private boolean flag=true;
	public boolean add(int o) {
		flag=true;
		if(root==null) {
			root=new Node(o);
			count++;
			return flag;
		}
		addNode(root,o);
		return flag;
	}
	private Node addNode(Node n,int key) {
		if(n==null) {
			count++;
			return new Node(key);
		}
		if(key<n.key) {
			n.left= addNode(n.left,key);
		}
		else if(key>n.key) {
			n.right= addNode(n.right,key);
		}else {
			flag=false;
			
		}
		return n;
	}
	public void traverse() {
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null) q.offer(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.println(n.key);
			if(n.left!=null) q.offer(n.left);
			if(n.right!=null) q.offer(n.right);
		}
	}
	
}
