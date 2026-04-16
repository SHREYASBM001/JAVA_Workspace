package com.downcasting;
//Partial Polymorphic version
abstract class Car {
	abstract void start();
	abstract void accel();
	abstract void stop();
}
class Audi extends Car {
	@Override 
	void start() {
		System.out.println("Audi starts");
	}
	@Override
	void accel() {
		System.out.println("Audi accelerates");
	}
	@Override 
	void stop () {
		System.out.println("Audio Stops");
	}
	void matrixLight() {
		System.out.println("Matrix Light Mode:ON");
	}
}
class Ferrari extends Car {
	@Override 
	void start() {
		System.out.println("Ferrari starts");
	}
	@Override
	void accel() {
		System.out.println("Ferrari accelerates");
	}
	@Override 
	void stop () {
		System.out.println("Ferrari Stops");
	}
	void sunroof() {
		System.out.println("Sunroof Mode:ON");
	}
}
class Driver {
	void drive(Car c) {
		c.start();
		c.accel();
		c.stop();
		
		if(c instanceof Audi) {
			((Audi)c).matrixLight();
		}
		if(c instanceof Ferrari) {
			((Ferrari)c).sunroof();
		}
		
		}
	}

public class Test1 {

	public static void main(String[] args) {
		Driver d=new Driver();
		d.drive(new Audi());
		d.drive(new Ferrari());
	}

}
