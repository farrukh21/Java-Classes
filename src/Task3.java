
public class Task3 {
  void num(int num1) {
	  for(int i=2; i<=num1; i++) {
	 
		  if (num1%i==0) {
		
			System.out.println("THe number is poliendrom");
			}else {
				System.out.println("Not poliendrom");
			}
	 
 }
  }
public static void main(String[] args) {
	Task3 pol= new Task3();
	pol.num(11);
}
}

