package com.class19;
/*
 * Create a method createEmail(). Based on provided users name, lastName and email type, your method should return complete email Address. Example: johnsnow@gmail.com or johnsnow@yahoo.com*
Write a method to return whether given number is prime or not?
Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F

 */

public class ClassTask {
	String createEmail(String name, String surname, String type) {
		String email = name + surname + "@" + type;
		return email;
	}

	boolean prime(int num) {
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}
		return prime;
	}
     
	char grade(int score) {
		char grade='\0';
		if(score>90) {
		grade='A';
		}else if(score>80) {
		grade='B';
		}else if(score>70) {
			grade='C';
		}else if(score>60) {
			grade='D';
		}else if(score>50) {
			grade='F';
		}else {
			System.out.println("Unknown");
		}
	return grade;
	}
}
