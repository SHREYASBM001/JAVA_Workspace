package com.upcasting;
class Animal {
	void animal() {
		System.out.println("Hello from Animal");
	}
	
}
class Dog extends Animal {
	void dog() {
		System.out.println("Hello from Dog");
	}
}
class Cat extends Animal {
	void cat() {
		System.out.println("Hello from cat");
	}
}
class Labroder extends Dog {
	void lab() {
		System.out.println("Hello from Lab Dog");
	}
}
public class Test6 {

	public static void main(String[] args) {
		Animal a =new Cat(); //upcasting
		Cat c=(Cat)a; //downcatsing to access subclass specific properties
		c.cat();
		Dog d=(Labroder)new Labroder();
		Labroder l=(Labroder)d;
		l.lab();
		Animal a1;

		a1 = new Dog();
		a.animal();

		a1 = new Cat();
		a1.animal();
		
		

	}

}
