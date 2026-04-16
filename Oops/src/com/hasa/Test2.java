package com.hasa;
class Name1 { 
	String firstName;
	String middleName;
	String lastName;
}
class Employee1 {
	int empid;
	Name1 n;
	//Strong HAS-A
	Employee1(int empid,String firstName,String middleName,String lastName){
		this.n=new Name1();
		this.empid=empid;
		this.n.firstName=firstName;
		this.n.middleName=middleName;
		this.n.lastName=lastName;
	}
	@Override
	public String toString() {
		return "\nEMPID start"+empid+"\n"+n.firstName+"\n"+n.middleName+"\n"+n.lastName+"\nEMPID END";
	}
}
class Teacher1 {
	int tid;
	Name1 n;
	Teacher1(int tid,String firstName,String middleName,String lastName){
		this.n=new Name1(); //needed to create object of name before assigning values,or else null pointer exception
		this.tid=tid;
		this.n.firstName=firstName;
		this.n.middleName=middleName;
		this.n.lastName=lastName;
	}
	@Override
	public String toString() {
		return "\nTID start"+tid+"\n"+n.firstName+"\n"+n.middleName+"\n"+n.lastName+"\nTID END";
	}
}
public class Test2 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1(1001,"Shrey","B","M");
		
		
		System.out.println(e1);
		
		Teacher1 t1=new Teacher1(2001,"hrey","C","N");
	
		
		System.out.println(t1);

	}

}
