package jfo6table;

import java.util.Scanner;

public class jfo6table {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Choose a number: ");
        int number = scanner.nextInt();

        // Use a for loop to display the multiples of the given number from 1 to 12
        for (int i = 1; i <= 12; i++) {
            // Calculate the multiple
            int multiple = number * i;

            // Display the result
            System.out.println(number + "x" + i + " = " + multiple);
        }

        // Close the scanner
        scanner.close();
    }
}
