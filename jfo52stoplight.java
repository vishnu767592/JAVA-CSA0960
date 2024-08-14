package jfo52stoplight;

import java.util.Scanner;

public class 3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the current color code
        System.out.print("Enter a color code (1 for Red, 2 for Green, 3 for Yellow): ");
        int currentColor = scanner.nextInt();

        // Determine the next traffic light color based on the current color code
        String nextColor;
        if (currentColor == 1) {
            nextColor = "Green";
        } else if (currentColor == 2) {
            nextColor = "Yellow";
        } else if (currentColor == 3) {
            nextColor = "Red";
        } else {
            nextColor = "Invalid color";
        }

        // Display the result
        if (nextColor.equals("Invalid color")) {
            System.out.println("Invalid color");
        } else {
            System.out.println("Next Traffic Light is " + nextColor);
        }

        // Close the scanner
        scanner.close();
    }
}
