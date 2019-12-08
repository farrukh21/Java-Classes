package com.class26;

public class EmployeeTest {

	public static void main(String args[]) {
		Employee emp=new Employee();
		emp.salary=80000;
		emp.getPaid();
		
		Fulltime fT=new Fulltime();
		fT.salary=90000;
		fT.bonus=10000;
		fT.getPaid();
		
		
	}
	
}
