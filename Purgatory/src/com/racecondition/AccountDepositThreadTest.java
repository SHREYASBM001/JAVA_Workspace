package com.racecondition;

public class AccountDepositThreadTest implements Runnable  {
	Account a;
	int amt;
	public AccountDepositThreadTest(Account a,int amt) {
	this.a=a;
	this.amt=amt;
	new Thread(this).start();
	}
	
	@Override
	public void run() {
		a.deposit(amt);
	}
}
