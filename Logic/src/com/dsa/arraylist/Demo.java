	package com.dsa.arraylist;
	
	import java.util.Arrays;
	
	public class Demo {
	
		public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(0,100);
		a.add(1,200);
		a.add(a.a.length-1,200);

		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("AFTER REMOVING");
		a.remove(a.size()-1);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println(a.a.length);
		
		}
		
		
		
	
	}
