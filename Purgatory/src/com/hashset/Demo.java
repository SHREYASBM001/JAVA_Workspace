package com.hashset;

public class Demo {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(16);
		h.add(23);
		h.add(32);
		h.display();
		System.out.println(h.add(16));
		h.remove(32);
		h.display();
		
		
	}
}
