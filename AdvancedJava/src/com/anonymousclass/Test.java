package com.anonymousclass;

public class Test {
	public static void main(String[] args) {
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("Hello1");
			}
		};
		r.run();
		
	}
}
