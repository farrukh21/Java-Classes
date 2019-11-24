
public class Task2 {

	void num(int num1){
		if(num1%2==0) {
			System.out.println(num1+"This number is even");
				
			}else {
				System.out.println(num1+ "is odd");
			}
		
		
	}
	
	public static void main(String[] args) {
		Task2 EvenOrOdd= new Task2();
		EvenOrOdd.num(5);
	}
}
