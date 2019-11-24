package com.class22;

public class TestStaticvsNonStatic {

	public static void main(String args[]) {
		/*how to access static members
		 * they can be accessed by classname
		 */ 
		 System.out.println(StaticvsNonstatic.school);
		 StaticvsNonstatic.getInfo1();
		 
		 /*how to access non static members
		  * they can be accessed by creating 
		  *an object of that class
		  */
		 StaticvsNonstatic obj= new StaticvsNonstatic();
		  obj.name="John";
	        obj.grade='A';
	        obj.getInfo();
	        //obj.getInfo1();possible, not preferable

	}
}
