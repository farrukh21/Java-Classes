package com.class34;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> llist=new LinkedList<>();
		
		//adding elements
		
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");
		llist.add("Bye");
		llist.add(2, "How are you?");
		System.out.println(llist);
		
		System.out.println("-------------------------------");
		
		//retrieve 1 element
		
		
		
		//retrieve all elements using for loop
		
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println("-------------------------------");
		
		//retrieve all elements using advanced for loop
		
				for(String i:llist) {
					System.out.println(i);
				}
		
		System.out.println("-------------------------------");
		
		//retrieve all elements Using Iteration
		
		Iterator<String> it=llist.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
		
	