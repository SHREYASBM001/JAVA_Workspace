package com.shrey.netbanking;
abstract class Account { //abstract because,forcing user to create only Savings or Current acc..
	String usrname;
	static int count=1;
	long accno=0;
	int bal=0;
	double interest_rate=0.04; //common interest rate for every account
	
	Account(String name){
		this.usrname=name;
		this.accno=count++;
	}
	void deposit(int amount) {
		
		this.bal+=amount;
		
	}
	void withdraw(int amount) {
		if(amount<=bal)
		this.bal-=amount;
		else
			System.out.println("Insufficient Balance");
	}
	void display() {
		System.out.println(" Name:"+usrname+"\n Account Number:"+accno+"\n Balance:"+bal+" rupees");
	}
	
}
class SavingsAccount extends Account {
	//two constructors,one for depositing amount on account creation and another for just account creation
	SavingsAccount(String name){
	
		super(name);
		}
	SavingsAccount(String name,int depositamount){
		
		super(name);
		this.bal=depositamount;
	
		
	}
	
	void interest () {
		double total_interest=this.bal*interest_rate*1; // interest per year Principle_amount*rate*time in years
		System.out.println("Total Interest per year="+total_interest+" rupees");
		 
	}
}
class CurrentAccount extends Account {
	int t_limit=300000;
	//two constructors,one for depositing amount on account creation and another for just account creation
	CurrentAccount(String name){
		super(name);
		System.out.println("New 'Current Account' First Transaction is without limit.Transaction Limit="+t_limit+" rupees");
		
			
	}
	CurrentAccount(String name,int depositamount){
		
		super(name);
		if(depositamount<=t_limit) this.bal=depositamount;
		System.out.println("New 'Current Account' First Transaction is without limit.Transaction Limit="+t_limit+" rupees");
		
		
	}

	
	@Override
	void deposit(int amount){
		if(amount<=t_limit)
			this.bal+=amount;
		else
			System.out.println("Your Transaction Amount Exceeds Limit.Transaction Limit="+t_limit+" rupees");
	}
	@Override
	void withdraw (int amount) {
		
		if(amount<=t_limit) {
			if(amount<=this.bal) {
			this.bal-=amount;
			}
			else { System.out.println("Insufficient Balance");  }
			}
		
		else {
			System.out.println("Your Transaction Amount Exceeds Limit.Transcation Limit="+t_limit+" rupees");
		}
		
		
	}
}
public class Test {

	public static void main(String[] args) {
	//create Account: Saving or Current
	SavingsAccount sa1=new SavingsAccount("shrey",10); //creating savings acc
	sa1.display();
	SavingsAccount sa2=new SavingsAccount("Help",20);
	sa2.display();
	
	sa1.deposit(20);
	sa1.display();
	sa1.withdraw(1000);
	sa1.withdraw(10);
	sa1.display();
	sa1.interest();
	
	CurrentAccount ca1=new CurrentAccount("gopi",10);
	ca1.display();
	ca1.withdraw(100000000);
	ca1.withdraw(10);
	ca1.display();
	
	}

}
