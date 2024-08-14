package jfo4celsius;

import java.util.Scanner;

public class jfo4celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);

        // Close the scanner
        scanner.close();
    }
}
