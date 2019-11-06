package reviewArray;

import java.util.Scanner;
public class ArrayRew {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows size");
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        String[][] names = new String[rows][cols];
        // names.length = rows
        // names.length = cols
        // Entering into array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Amigo, enter a name!");
                names[i][j] = scan.next();
            }
        }
        System.out.println("Lets print the names");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[0].length; j++) {
                System.out.print(names[i][j] + " ");
            }
        }
        System.out.println();
}
}

	


