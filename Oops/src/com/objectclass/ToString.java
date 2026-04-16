package com.objectclass;

public class ToString extends Object {
	int i;
	@Override //overriding Object class's Method
	public String toString() {
		return i+"";
	}
	public static void main(String[] args) {
	ToString ts=new ToString();
	ts.i=10;
	System.out.println(ts); //implicitly calls overridden method toString..
	System.out.println(ts.toString());
	
	Student s=new Student("Shrey",18,1);
	System.out.println(s);
	}

}
class Student { //has invisible extend to Object class,means top class always inherit Object class,except interface 
	String name;
	int age;
	int id;
	
	Student(String name,int age,int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	@Override
	public String toString() {
		return name+" "+age+" "+id;
	}
}
