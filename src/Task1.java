
public class Task1 {
	void num(int num1, int num2) {
		if(num1<num2) {
			System.out.println(num1+" is greater");
		}else {
			System.out.println(num2+" is greater");
		}
	}
public static void main(String[] args) {
	Task1 a= new Task1();
	a.num(10, 9);
	
	
}
}