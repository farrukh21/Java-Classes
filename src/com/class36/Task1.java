package com.class36;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Person {

	private String name, lastName;
	private int salary, age;

	Person(String name, String lastName, int salary, int age) {
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
	}
	public void details() {
		System.out.println(name +" "+ lastName+" " + salary +" "+age);
	}
}

public class Task1 {

	public static void main(String[] args) {
		
	
	TreeMap<Integer, Person>test=new TreeMap<>();
	test.put(1,new Person("alijon","Nazarov",100, 44));
	test.put(2,new Person("Farrukh", "Akhmedov", 200,24));
	
	Set<Entry<Integer, Person>> set = test.entrySet();
	
	for(Entry<Integer, Person> a: set) {
		a.getValue().details();
	}
	
}
}
