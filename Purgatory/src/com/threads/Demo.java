package com.threads;

public class Demo {
	public static void main(String[] args) {
		Thread t1=new Thread(new Test());
		t1.start();
	}
}
class Test implements Runnable {
	@Override 
	public void run() {
		System.out.println("h");
	}
}