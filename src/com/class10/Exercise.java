package com.class10;

public class Exercise {
public static void main(String[] args) {
	String [] capital= { "USA","Russia","Turkey"};
	
	for(int i=0; i<capital.length; i++) {
		if(capital[i].equals("USA")) {
			System.out.println("Washington DC");	
		}else if(capital[i].equals("Russia")) {
			System.out.println("Moscow");	
		}else if(capital[i].equals("Turkey")){
			System.out.println("Ankara");
		}
		
	}
}
}
