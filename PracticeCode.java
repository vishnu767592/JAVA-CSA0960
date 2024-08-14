package addnumbers100;

import java.util.Scanner;
public class PracticeCode {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			int N = 100;
			int total = 0;
			System.out.println("This program adds " + N + " numbers.");
			for (int i = 0; i < N; i++) {
			    System.out.println("Enter your next number:");
			    int value = in.nextInt();
			    total += value;
			}
			System.out.println("The total is " + total + ".");
		}
    }
}
