package com.functionalinterface;

public class Demo {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.speak();
		Lambda l=()-> {
					System.out.println("hellow");
				};
				l.speak();
		///////////////////////////////
		printThing(
				()->{
					System.out.println("HT");
				}
				);
		
				
	}
	public static void printThing(Lambda l) {
		l.speak();
	}
	
}
