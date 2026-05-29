package com.lambdaexp;

public class Test {
	public static void main(String[] args) {
		Runnable r=()->{System.out.println("Hello");};
		r.run();
	}
}
