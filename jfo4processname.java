package jfo4processname;

import java.util.Scanner;

public class jfo4processname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Type your name: ");
        String fullName = scanner.nextLine();

        // Trim any extra spaces and split the name into first and last name
        String[] nameParts = fullName.trim().split(" ");

        // Extract the last name and the first initial
        String lastName = nameParts[1];
        char firstInitial = nameParts[0].charAt(0);

        // Display the formatted name
        System.out.println("Your name is: " + lastName + ", " + firstInitial + ".");

        // Close the scanner
        scanner.close();
    }
}
