package com.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class P2 {
	
	private List<Integer>list;
	private static final int SIZE=10;
	
	public P2() {
		list=new ArrayList<Integer>(SIZE);
		for(int i=0;i<SIZE;i++) {
			list.add(i);
		}
	}
	
	public void writeList() throws IOException {
		PrintWriter out=new PrintWriter(new FileWriter("Out.txt"));
		
		for(int i=0;i<SIZE;i++) {
			out.println("Value at:"+i+"is:"+list.get(i));
		}
	}
	
	public static void main(String[] args) throws IOException {
		P2 l1=new P2();
		try {
		l1.writeList();
		}
		catch(IOException e) {
			PrintWriter out=new PrintWriter(new FileWriter("he.txt"));
			out.println("IO EXCEPTION");
		}
	
	}

}
