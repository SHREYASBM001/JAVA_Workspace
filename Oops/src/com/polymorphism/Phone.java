package com.polymorphism;
@FunctionalInterface 
interface Sim {
	void connect();
}
class Airtel implements Sim {
	public void connect() {
		System.out.println("Call Con using Airtel");
	}
}
class Jio implements Sim {
	public void connect () {
		System.out.println("call Con using Jio");
	}
}
public class Phone {
	Sim s;
	Phone(Sim s){
		this.s=s;
	}
	void call() {
		s.connect();
	}
	//My method implementation below
	void phoneDriver(Sim s){
		s.connect();
	}
	public static void main(String[] args) {
		
		Phone p=new Phone(new Airtel()); //s becomes Airtel
		p.call();
		p=new Phone(new Jio()); //s becomes Jio
		p.call();
		p.phoneDriver(new Airtel());
		p.phoneDriver(new Jio());
	}

}
