package com.class25;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Create an object of an Epmloyee Class");
		Employee emp= new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("****************************************");
		System.out.println("Creating an object of a Employee class");
		ScrumTeam sm= new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily Standup";
		sm.attendScrumMeetings();
		
		System.out.println("#######################################");
		Developer dev= new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Spring Demo, Planning, Retro, Daily Standup";
		dev.attendScrumMeetings();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Tester tes= new Tester();
		tes.salary=110000;
		tes.work();
		tes.getPaid();
		tes.artifacts="Sprint Backlog";
		tes.ceremonies="Spring Demo, Planning, Retro, Daily Standup";
		tes.attendScrumMeetings();
		
		System.out.println("******************************");
		ScrumMaster scr= new ScrumMaster();
		scr.salary=90000;
		scr.work();
		scr.getPaid();
		scr.artifacts="Sprint Backlog";
		scr.ceremonies="Spring Demo, Planning, Retro, Daily Standup";
		scr.organize();
		
		
	}

}
