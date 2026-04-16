package com.stringconcepts;

public class A {

	public static void main(String[] args) {
		String s="hello"; /*SCP(String constant pool(special memory for storing String constants)),
		*checks whether "hello" is already present in SCP,if present
		*that same reference is assigned to s,else new String object is created
		*/
		String s1="hello"; /*SCP(String constant pool),checks whether "hello" is already present in SCP,if present
		
		*that same reference is assigned to s1,else new String object is created..This mechanism is used to save memory
		*/
					
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println(s==s1);//true
		String s2=new String("hello"); 
		/*first object is created for "hello" in SCP" then,
		 * new String Creates another string object in Heap memory and stores that address to s2.
		 * so s==s2 gives false
		 */
		
		
		System.out.println(s==s2); //false
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String s3="abcd";
		String s4="ab";
		String s6=s4+"cd";
		/*first new string object is created for "abcd" in SCP" then,
		 * new string object is created for "ab" in SCP" then,
		 * new string object is created for "cd" in SCP" then,
		 * since s4 is just reference variable,and "cd" is a string constant,so it creates new string object for concatination.
		 * then that concatinated reference is stored in s6.
		 * so s3==s6 gives false
		 */
		
		System.out.println(s3==s6); //false
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String s7="abcd"; /*checks in SCP before creating a new String object to see if there are similar object with same state
		*since there's already an object s3 present with same state,that s3 adress is assigned to s7
		*so s3==s7 gives true
		*/
		System.out.println(s3==s7);
		final String s8="ab";/*checks in SCP before creating a new String object to see if there are similar object with same state
		*since there's already an object s4 present with same state,that s4 adress is assigned to s8
		*so s4==s8 gives true
		*/
		System.out.println(s8==s4);
		String s9=s8+"cd"; /*
		*since s8 became constant by using final,now ,during concatination,s8 is treated as constant,after concatination
		* becomes "abcd" which is already present in SCP(s3),so reference of s3 is assigned to s9
		* so,s3==s9 gives true
		* so,s7==s9 gives true 
		* 
		*/
		System.out.println(s3==s9); //true
		System.out.println(s7==s9); //true
	
	}

}
