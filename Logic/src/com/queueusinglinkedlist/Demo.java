package com.queueusinglinkedlist;

public class Demo {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		
	
		System.out.println((Integer)q.peek());
		
		
		while(!q.isEmpty()) {
			System.out.println((Integer)q.poll());
		}
		
	}

}
