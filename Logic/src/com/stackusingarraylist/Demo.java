package com.stackusingarraylist;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		Stack s=new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s.peek());
		
		while(!s.isEmpty()) {
			System.out.println((Integer)s.pop());
		}
		throw new IOException()

	}

}
