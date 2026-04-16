package com.downcasting;
//full Polymorphic version
abstract class Cars {
	abstract void start();
	abstract void accel();
	abstract void stop();
	abstract void special_feature();
		
	
}
class BMW extends Cars {
	@Override 
	void start() {
		System.out.println("BMW starts");
	}
	@Override
	void accel() {
		System.out.println("BMW accelerates");
	}
	@Override 
	void stop () {
		System.out.println("BMW Stops");
	}
	void matrixLight() {
		System.out.println("Matrix Light Mode:ON");
	}
	@Override
	void special_feature() {
	matrixLight();
	}
}
class Benz extends Cars {
	@Override 
	void start() {
		System.out.println("Benz starts");
	}
	@Override
	void accel() {
		System.out.println("Benz accelerates");
	}
	@Override 
	void stop () {
		System.out.println("Benz Stops");
	}
	void sunroof() {
		System.out.println("Sunroof Mode:ON");
	}
	@Override 
	void special_feature() {
	sunroof();
	}
}
class Drivers {
	void drive(Cars c) {
		c.start();
		c.accel();
		c.stop();
		c.special_feature();
		
	}
}

public class Test2 {

	public static void main(String[] args) {
		Drivers d=new Drivers();
		d.drive(new BMW());
		d.drive(new Benz());
	}

}
