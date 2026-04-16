package com.objectclass;

public class Mobile {
	String name;
	int ram;
	int rom;
	String color;
	
	Mobile(String name,int ram,int rom,String color){
	this.name=name;
	this.ram=ram;
	this.rom=rom;
	this.color=color;
	}
	@Override
	public String toString() {
		return name+"\n"+ram+"\n"+rom+"\n"+color;
	}
	public boolean equals(Object o) {
		return this.name.equals(((Mobile)o).name) && this.ram==((Mobile)o).ram && this.rom==((Mobile)o).rom && this.color.equals(((Mobile)o).color); 
	}
	public static void main(String[] args) {
	Mobile m1=new Mobile("oppo",4,64,"black");
	Mobile m2=new Mobile("oppo",4,64,"black");
	Mobile m3=new Mobile("motu",4,64,"black");
	
	System.out.println(m1.toString()); //explicit calling of toString
	System.out.println(m2); //implicit calling of toString
	System.out.println(m3);
	
	System.out.println(m1==m2);
	 
	System.out.println(m1.equals(m2));
	System.out.println(m2.equals(m3));

	}

}
