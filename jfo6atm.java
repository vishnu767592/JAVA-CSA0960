package jfo6atm;

import java.util.Scanner;

public class jfo6atm {
    public static void main(String[] args) {
        // Step 1: Declare a valid integer PIN
        final int VALID_PIN = 1234;

        // Step 2: Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Variable to hold the user's entered PIN
        int enteredPIN;

        // Step 3: Prompt the user to enter the PIN
        System.out.print("Please enter your PIN: ");
        enteredPIN = scanner.nextInt();

        // Step 4: Use a while loop to check if the entered PIN is correct
        while (enteredPIN != VALID_PIN) {
            // If the entered PIN is incorrect, prompt the user again
            System.out.print("Incorrect PIN. Please try again: ");
            enteredPIN = scanner.nextInt();
        }

        // Once the correct PIN is entered, print a success message
        System.out.println("Correct PIN entered. You now have access to your account.");
        
        // Close the scanner
        scanner.close();
    }
}
