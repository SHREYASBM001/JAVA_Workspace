package com.upcasting;
abstract class Cars {
	abstract void start();
	abstract void accel();
	abstract void stop();
}
class Merc extends Cars {
	void start() {
		System.out.println("Merc engine started");
	}
	void accel() {
		System.out.println("Merc Accelerated");
	}
	void stop() {
		System.out.println("Merc Applied Brake");
	}
}

class BMW extends Cars {
	void start() {
		System.out.println("BMW starts");
	}
	void accel() {
		System.out.println("BMW accelerated");
	}
	void stop() {
		System.out.println("BMW stops");
	}
}
class Driver2 {
	void drive(Cars c) {
		c.start();
		c.accel();
		c.stop();
		System.out.println("-------------");
		
	}
}

public class Test4 {

	public static void main(String[] args) {
	
	Cars c=new BMW();
	c.start();
	c.accel();
	c.stop();
	System.out.println("main() ends-------------");
	
	Driver2 d=new Driver2();
	d.drive(new BMW());
	d.drive(new Merc());
	

	}

}
