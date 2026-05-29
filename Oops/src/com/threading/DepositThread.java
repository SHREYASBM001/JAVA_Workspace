package com.threading;

public class DepositThread implements Runnable {
	Account a;
	int amt;
	public DepositThread(Account a,int amt) {
		this.a=a;
		this.amt=amt;
		new Thread(this).start();
	}
	@Override
	public void run() {
		a.deposit(amt);
	}
}
