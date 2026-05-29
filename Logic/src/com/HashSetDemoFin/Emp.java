public class Emp {
	String name;
	double sal;
	
	Emp(String n,double s){
		name=n;
		sal=s;
	}
	@Override 
	public int hashCode(){
		return name.charAt(0);
	}
	public String toString(){
		return "Emp[name:"+name+",sal:"+sal+"]";
	}
	@Override 
	public boolean equals(Object o) {
		if(!(o instanceof Emp)){
			return false;
		}
		return name.equals(((Emp)o).name) && sal==((Emp)o).sal;
	}
}