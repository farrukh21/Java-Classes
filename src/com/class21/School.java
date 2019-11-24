package com.class21;

public class School {
public static void main(String[] args) {
	StudentJava student1 = new StudentJava();
	// assigning instance variables
	student1.studentName="Eric";
	student1.GPA=3.95;
	student1.school="Syntax";
	
	StudentJava student2= new StudentJava();
	student2.studentName="Jaime";
	student2.GPA =3.90;
	student2.school="Syntax";
	
	student1.displayInfo();
	student1.study(3);
	student1.displayInfo();
	
	
}
}
