package com.upcasting;
class Car{
void start()	{
	
}

void accelerate() {
}

void brake() {
	
}
}
class Audi extends Car {
void start() {
	System.out.println("Audi engine Starts");
}
void accelerate() {
	System.out.println("Audi accelarate");
}
void brake() {
	System.out.println("Audi stops");
}
}
class Benz extends Car {
	void start() {
		System.out.println("Benz engine Starts");
	}
	void accelerate() {
		System.out.println("Benz accelarate");
	}
	void brake() {
		System.out.println("Benz stops");
	}	
}
class Driver { /*since Upcasting like this : (SuperClass) ref=(SuperClass)new (Subclass) ,causes early binding 
by compiler,so we can implement like this call subclass's methods using superclass type variables,happens because 
of late binding(At runtime java decides which class's method to run based on adress/ref)
*/
	void drive(Car c) {
		c.start(); //late binding
		c.accelerate(); //late binding
		c.brake(); //late binding.
	}
}
public class Test2 {

	public static void main(String[] args) {

		Driver d=new Driver();
		d.drive(new Audi());
		d.drive(new Benz());

	}

}
