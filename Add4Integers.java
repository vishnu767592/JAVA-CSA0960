package addoffournumbers;

import java.util.Scanner;
public class Add4Integers {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			System.out.println("This program adds four numbers.");
			System.out.println("Type each number, followed by Enter.");
			int n1 = in.nextInt();
			int n2 = in.nextInt();
			int n3 = in.nextInt();
			int n4 = in.nextInt();
			int total = n1 + n2 + n3 + n4;
			System.out.println("The total is " + total + ".");
		}
    }
}
