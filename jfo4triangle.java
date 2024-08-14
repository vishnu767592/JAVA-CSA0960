package jfo4triangle;

import java.util.Scanner;

public class jfo4triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the lengths of the two sides of the triangle
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        // Calculate the hypotenuse using the Pythagorean theorem
        double c = Math.sqrt((a * a) + (b * b));

        // Display the result
        System.out.println("The length of the hypotenuse is: " + c);

        // Close the scanner
        scanner.close();
    }
}
