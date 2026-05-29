package com.Queue;

public class Demo {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}
