package com.hasa;
class Name { 
	String firstName;
	String middleName;
	String lastName;
}
//WEAK HAS-A
class Employee {
	int empid;
	Name n;
	@Override
	public String toString() {
		return "\nEMPID start"+empid+"\n"+n.firstName+"\n"+n.middleName+"\n"+n.lastName+"\nEMPID END";
	}
}
class Teacher {
	int tid;
	Name n;
	@Override
	public String toString() {
		return "\nTID start"+tid+"\n"+n.firstName+"\n"+n.middleName+"\n"+n.lastName+"\nTID END";
	}
}
public class Test {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.empid=1001;
		e1.n=new Name();
		e1.n.firstName="shrey";
		e1.n.middleName="b";
		e1.n.lastName="m";
		
		System.out.println(e1);
		
		Teacher t1=new Teacher();
		t1.tid=2001;
		t1.n=new Name();
		t1.n.firstName="hrey";
		t1.n.middleName="c";
	    t1.n.lastName="n";
		
		System.out.println(t1);

	}

}
