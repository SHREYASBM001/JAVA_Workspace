package com.anonymousclass;
@FunctionalInterface
interface Cat{
	void speak();
}
public class Test2 {
	public static void main(String[] args) {
		
	
	Cat c=new Cat() {
		public void speak() {
			System.out.println("hell");
		}
	};
	c.speak();
	}
	
}
