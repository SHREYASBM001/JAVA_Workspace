package com.racecondition;

public class AccountRaceConditionTest {
	public static void main(String[] args) {
		Account a1=new Account(1000);
		System.out.println(a1.bal);
		
		new AccountDepositThreadTest(a1,2000);
		new AccountDepositThreadTest(a1,5000);
		
		try{ Thread.sleep(4000); } catch(Exception e) {}
		
		System.out.println(a1.bal);
		
	}
}
