package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExceptionTest {
	
	void fopen() throws FileNotFoundException {
		
		FileReader f=new FileReader("Hell.text");
		
	}
	public static void main(String[] args) {
		
		FileReaderExceptionTest t1=new FileReaderExceptionTest();
		try {
		t1.fopen();
		} 
		catch(FileNotFoundException e) {
			System.out.println("File not exists");
		}
	}

}
