package com.class19;

public class TaskReturn {
	public static void main(String[] args) {

	ClassTask obj= new ClassTask();
	String adress=obj.createEmail("Farrukh", "Akhmedov", "hotmail.com");
System.out.println(adress);

    Boolean prime1=obj.prime(7);
    System.out.println(prime1);
    
    char mygrade=obj.grade(85);
    System.out.println(mygrade);
	}
}
