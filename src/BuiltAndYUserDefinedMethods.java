import java.util.Scanner;

public class BuiltAndYUserDefinedMethods {

 public static void main(String[] args) {
	String str="Hello";
	str=str.replace("Hello", "hello");
	System.out.println(str);
	
	Scanner scan= new Scanner(System.in);
	scan.hasNextLine();
	
	BuiltAndYUserDefinedMethods obj= new BuiltAndYUserDefinedMethods();
	obj.myMethod1();

 
 }

void myMethod1() {// method header
	 System.out.println("This is user defined method that I created");// method body
}
void myMethod() {
	 System.out.println("this is user defined method that i created");
 }

}

