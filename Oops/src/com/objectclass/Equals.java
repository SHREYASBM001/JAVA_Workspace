package com.objectclass;

public class Equals {
	String name;
	int age;
	int id;
	
	Equals(String name,int age,int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	@Override
	public String toString() {
		return name+" "+age+" "+id;
	}
	@Override
	// Equals type ref to Object type ref (sub to super)(Upcasting)
	//so downcast it to access Equals's instance variables
	public boolean equals(Object o) {
		// Equals e=(Equals)o; 
		
		return this.name.equals(((Equals)o).name) && this.age==((Equals)o).age && this.id==((Equals)o).id;
		//always compare string using equals,not "==",because for string,because String has equals overrriden method inside it..
	}
	public static void main(String[] args) {
	Equals e1=new Equals("shrey",18,1);
	Equals e2=new Equals("shrey",18,1);
	System.out.println(e1);
	System.out.println(e2);
	
	System.out.println(e1==e2); //false //compares reference(fully qualified class name)
	System.out.println(e1.equals(e2)); //true //compares reference(fully qualified class name) if there's no overridden method
	
	}

}
