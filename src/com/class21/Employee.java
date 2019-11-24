package com.class21;

public class Employee {

	int eID; //instance variable
	int salary;
	static String CEO= "";//static
void farrukh(){
	String a="aziza";//local
	System.out.println(a);
}
	


public static void main(String args[]) {

	Employee Alisher= new Employee();
	Alisher.eID=002;
	Alisher.salary=120000;
    Employee.CEO="SUMAIR";
    Alisher.farrukh();
    
	
	Employee Alijon= new Employee();
	Alijon.salary=35;
	Alijon.eID=50;
	
	System.out.println("Alishers eID is "+Alisher.eID+"and Alishers salary is "+Alisher.salary+"his CEO is "+Alisher.CEO);
	System.out.println("Alijon eID is "+Alijon.eID+"and his Salary is "+Alijon.salary+" his CEO is "+Alisher.CEO);
	
}
}