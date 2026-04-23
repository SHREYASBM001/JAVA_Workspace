package nonprimitivecompare;

import java.util.Arrays;

class Empp {
	String name;
	int sal;
	Empp(String name,int sal){
		this.name=name;
		this.sal=sal;
	}
	public String toString() {
		return "Empp[name:"+name+", sal:"+sal+"]";
	}
}
public class Test1 {
	public static void main(String [] o) {
		Empp[] e=new Empp[3];
		e[0]=new Empp("Zura",20888);
		e[1]=new Empp("Lipsun",10089);
		e[2]=new Empp("Amares",90123);
		System.out.println("Before Sorting:");
		for(Empp temp:e) {
			System.out.println(temp);
		}
		
		Arrays.sort(e,new SalComp());
		System.out.println("After Sorting by sal:");
		for(Empp temp:e) {
			System.out.println(temp);
		}
		Arrays.sort(e,new NameComp());
		System.out.println("After Sorting by name:");
		for(Empp temp:e) {
			System.out.println(temp);
		}
	}
}
