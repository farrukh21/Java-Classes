package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

class Main {
  public static void main(String args[]){
    ArrayList <Integer> list=new ArrayList<>();
    list.add(111);
    list.add(222);
    list.add(333);
    list.add(444);
    list.add(555);
    list.add(666);
   
//   for(int i=0; i<list.size(); i++) {
	  // System.out.println(list.get(i));
   
	Iterator<Integer> it=list.iterator();
   while(it.hasNext()){
      if(it.next() != null){
      }
    }
    System.out.println(list);
  }
}
