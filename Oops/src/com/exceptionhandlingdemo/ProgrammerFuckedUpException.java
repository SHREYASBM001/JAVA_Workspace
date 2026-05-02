package com.exceptionhandlingdemo;

public class ProgrammerFuckedUpException extends Exception{

	public ProgrammerFuckedUpException() {
		super("you have written some ass code,check it");
	}
}
