package com.class30;

public class test {

	public static void main(String[] args) {
		Parent p=new Child();
		//Child c= new Parent();
		p.phone();
		p.phone();
		Parent a=new Parent();
		a.phone();
		//a.main();
		System.out.println("--------------");
		Child v= new Child();
		v.main();
		v.phone();
	
	}
}