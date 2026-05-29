package com.racecondition;

public class Account {
	int bal;
	
	public Account(int amt) {
		bal=amt;
	}
	void deposit(int amt) {
		bal+=amt;
		System.out.println(amt+" Credited");
	}
}
