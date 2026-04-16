package com.stringconcepts;

public class B {

	public static void main(String[] args) {
		Object o1="abcd";/*
		*string literal,check if there is an object with the same state,if not there creates a new String object,
		*if its there,it uses the same pooled string..
		*in this case "abcd" is not exists in SCP,so creates a new String object,and the reference of that String
		*object is stored in Object class type reference variable.(UPCASTING)..
		*so,when we do "System.out.println(o1);" ,object class's toString wont run,because,it'll be decided at runtime
		*based on instance,since the o1 stores instance of type String,String Class's toString method is called.
		*/
		System.out.println(o1);
		
		/*But can we do this "System.out.println(o1.length());",NOOO,because,cant access subclass(String) specific
		 * properties using Top class type variable even though o1 stores String type data and instance..
		 * at compile time itself,checks if there's a method called "length()" in Object class,since its not there(ERROR)
		 * in order to access subclass specific properties,we have to downcast it and call like "((String)o1).length();"..
		 * assume if there is a length() method in Object class,then at compile time it wont throw error,and at runtime,
		 * JRE decides which class's "length()" method to run based on instance type..
		 * 
		 * */
		System.out.println(((String)o1).length());
	}

}
