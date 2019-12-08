package com.class27;

public class FinalKeyword1 { // final class prevents creating a subclass
	public final String str="Hello";
	
	public static void main(String args[]) {
	}
		public final void hello() {
			System.out.println("I am a final method in Parent class");
		}
		public final void hello(String a) {
			System.out.println("I am a final method in Parent class");
		}
		//it can be overloaded
	
class FinalKeywordChild extends FinalKeyword1{
	//but final methods cannot be overriden, we will get CE
	//public final void hello(){
	//System.out.println();
	//{
}
}
