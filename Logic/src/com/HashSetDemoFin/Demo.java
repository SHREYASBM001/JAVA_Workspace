public class Demo {
public static void main(String [] args){
	Emp e1=new Emp("pavankalyan",56000);
	Emp e2=new Emp("pavankalyan",56000);
	Emp e3=new Emp("pavankal",56000);
	HashSet h=new HashSet();
	
	Student s1=new Student("name");
	h.add(s1);
	System.out.println(h.add(e1));
	System.out.println(h.add(e2));
	System.out.println(h.add(e3));
}
	
}