package com.class29;
class Main extends Parent{
	  @Override
	    void first(int i){
	      System.out.println("abstract method2 implementation with argument in main class");
	    }
	    void second(){
	        System.out.println("abstract method2 implementation with argument in main class");
	      }
	      public static void main(String[] args) {
	        Main obj= new Main();
	        obj.first(4);
	        obj.second();
	    }
	  
	}
