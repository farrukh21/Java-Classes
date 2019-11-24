
public class Hello {

	void sayHello(String name){
		System.out.println("Hello"+name);
		
	}
	public static void main(String[] args) {
		Hello obj= new Hello();
		obj.sayHello("Farrukh");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Russia");
		obj.sayHelloDifferentLanguage("Turkey");
		//obj.sayHelloDifferentLanguage(123); you will get compiler error 4
		
		obj.sayNameAndAge("Jack", 45);
		obj.sayNameAndAge("Olga", 50);
		obj.isSnowing(true);
		obj.isSnowing(false);
	}
	/*
	 * create a method that will say hello in different language based
	 * on the value that will be passed when user calls a method
	 */

	void sayHelloDifferentLanguage(String country) {
	
		
		switch (country.toLowerCase()) {
		
		case "USA":
			System.out.println("Hello");
			break;
		case "Russia":
			System.out.println("Privet");
		break;
		case "Paraguay":
			System.out.println("Hola");
		break;
		case "Albania":
			System.out.println("Pershndetje");
			
		
		}
		
	}

//method to say name and age
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}
	// create a method that will check if it is snowing
	// if snow--> stay at home, otherwise
	
	     //method name
	void isSnowing(boolean isSnowing) {//method header (method parameter)
		// method body
		if (isSnowing) {
			System.out.println("Stay home");
			
		}else {
			System.out.println("go for a walk");
		}
	}
}
