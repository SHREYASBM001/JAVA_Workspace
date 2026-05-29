package com.threads;

public class Threads {
	public static void main(String[] args) {
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
		th1.start();
		th2.start();
	}
}
class Thread1 extends Thread {
	@Override
	public void run() {
	System.out.println("hellow");
	}
}
class Thread2 extends Thread {
	@Override
	public void run() {
	Thread.currentThread().setPriority(1);
	System.out.println("Bye");
	}
}