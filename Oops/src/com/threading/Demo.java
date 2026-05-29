package com.threading;

public class Demo {
	public static void main(String[] args) {
		Account a1=new Account(1000);
		
		System.out.println("a1 account balance is:"+a1.getBal());
		
		new DepositThread(a1,2000);
		new DepositThread(a1,2000);
		
		
		try { Thread.sleep(6000); } catch(Exception e) {}
		
		System.out.println("a1 account balance is:"+a1.getBal());
	}
}
