package com.exceptionhandlingdemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		Exception e= new ProgrammerFuckedUpException();
		System.out.println(e.getMessage());
	}
}
