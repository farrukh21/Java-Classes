package com.class25_1;

public class Programming {

	void programming(){
		System.out.println("I love programming language");
	}
	void programming(String a){
	System.out.println("I love "+a);	
	}
	static void cup(String drink) {
		System.out.println("Cup of "+drink);
	}
	static void cup(String drink, String dont) {
		System.out.println("I drink "+drink+" but i dont drink "+dont);
	}
	static void cup(String drink, int a) {
		System.out.println("I drink "+ a+" cups of "+drink);
	}
	private void phone(String a) {
		System.out.println("I got an "+a);
	}
	private void phone(String a, int b) {
		System.out.println("I got an "+a+" "+b);
	}
	private void phone(String a, String b, int c) {
		System.out.println("I got an "+ a+" but i want "+b+a);
	}
	
	public static void main(String args[]) {
		Programming obj= new Programming();
		obj.programming("Java");
		obj.programming();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		Programming tea= new Programming();
		tea.cup("tea");
		tea.cup("tea", 2);
		tea.cup("tea", "coffee");
		
		Programming tele= new Programming();
		tele.phone("Iphone");
		tele.phone("Iphone", 11);
		tele.phone("Iphone","samsung",6);
		
	}
	
}
