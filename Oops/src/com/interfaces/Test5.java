package com.interfaces;
interface Car{
	void start();
	void accel();
	void brake();
	default void airBag() {
		System.out.println("AirBag Ready to Activate");
		jumpUp();
	}
	void showNumberPlate();
	private void jumpUp() {
		System.out.println("JUMP");
	}
}
class Audi implements Car{ 
	public void start() {
		System.out.println("Audi Starts");
	}
	public void accel() {
		System.out.println("Audi Accelerated");
	}
	public void brake() {
		System.out.println("Audi Stops");
	}
	private void numberplate() {
		System.out.println("NUMBER PLATE:Audi Car");
	}
	public void showNumberPlate() {
		numberplate();
		secret();
	}
	private void secret() {
		System.out.println("BLACK BOX data of Audi");
	}
}
class BMW implements Car {
	public void start() {
		System.out.println("BMW starts");
	}
	public void accel() {
		System.out.println("BMW Accelerated");
	}
	
	public void brake() {
		System.out.println("BMW stops");
	}
	void numberplate() {
		System.out.println("NUMBER PLATE:BMW car");
	}
	public void showNumberPlate() {
		numberplate();
		secret();
	}
	private void secret() {
		System.out.println("BLACK BOX data of BMW");
	}
}
class Driver {
	void drive(Car c) {
	c.start();
	c.accel();
	c.brake();
	c.airBag();
	c.showNumberPlate();
	}
}
public class Test5 {

	public static void main(String[] args) {
		
		Driver d=new Driver();
		d.drive(new Audi());
		d.drive(new BMW());
	}

}
