package com.class21;

public class Students {
	String studentName;
	int StudentID;
	static int numberOfStudents;
	

	public static void main(String args[]) {
	//	for(int i=1; i<=3; i++) {
		
		//}
		Students Aziza= new Students();
		Aziza.studentName="Azizakhon";
		Aziza.StudentID=571;
		Students.numberOfStudents++;
		
		Students Farrukh= new Students();
		Farrukh.studentName="Farrukh";
		Farrukh.StudentID=354;
		Students.numberOfStudents++;
		
		Students Akhmad= new Students();
		Akhmad.studentName="Akhmad";
		Akhmad.StudentID=36;
		Students.numberOfStudents++;
		
		System.out.println("The total number of students is: "+Aziza.numberOfStudents);
		
		
	}
}
