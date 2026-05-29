package com.hashset;

public class Demo {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add(38);
		h.add(11);
		h.add(23);
		
		h.display();
		
		System.out.println(h.add(23));
		System.out.println(h.add(13));
		h.display();

	}

}
