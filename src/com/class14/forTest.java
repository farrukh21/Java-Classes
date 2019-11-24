package com.class14;

public class forTest {

	public static void main(String args[]) { 
		  String c = "Hello i love java";
		  boolean var;
		  var = c.startsWith("hello");
		  System.out.println(var);
		  String str = "0123456789";
		  System.out.println(str.substring(4));
		  String word ="abrakadabra";

	      String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

	      System.out.println(replace);
	      int i = 50;

	      int[] a = new int[10];
	      System.out.println(a.length);

	      a = new int[100];
	      System.out.println(a.length);

	      a = new int[i];
	      System.out.println(a.length);
	      
	      
		}
}

