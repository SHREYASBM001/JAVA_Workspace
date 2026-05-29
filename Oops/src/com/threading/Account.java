package com.threading;

public class Account {
	private int bal;
	
	public Account(int bal) {
		this.bal=bal;
	}
 	synchronized public void deposit(int amt) {
		try { Thread.sleep(2500); } catch(Exception e) {}
		bal+=amt;
		System.out.println(amt+" rupees credited");
	}
	public int getBal() {
		return bal;
	}
}
