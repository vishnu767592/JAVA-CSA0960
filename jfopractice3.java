package jfopractice3;

import java.util.Scanner;

public class jfopractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting inputs
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.print("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();

        System.out.print("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();

        System.out.print("Enter your favorite animal: ");
        scanner.nextLine(); // Consume the newline left-over
        String animal = scanner.nextLine();

        System.out.print("Enter your favorite food: ");
        String food = scanner.nextLine();

        System.out.print("Enter your hometown: ");
        String hometown = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter a large number: ");
        long largeNumber = scanner.nextLong();

        System.out.print("Enter a friend's name: ");
        scanner.nextLine(); // Consume the newline left-over
        String friendName = scanner.nextLine();

        // Doing some math with the inputs
        int futureAge = age + number;
        double halfDecimal = decimalNumber / 2;

        // Generating the story
        System.out.println("\n--- Your JavaLibs Story ---\n");
        System.out.println("Once upon a time in the town of " + hometown + ", there lived a person named " + name + ".");
        System.out.println(name + " loved the color " + color + " and always wore a " + color + " shirt.");
        System.out.println("One day, " + name + " and their best friend " + friendName + " decided to go on an adventure.");
        System.out.println("They packed a bag full of " + food + " and set off to explore the world.");
        System.out.println("On their way, they encountered a " + animal + " that could talk!");
        System.out.println("The " + animal + " said, 'Hello " + name + "! Did you know that I am " + halfDecimal + " years old?");
        System.out.println(name + " was amazed and decided to ask the " + animal + " a question.");
        System.out.println("'If I am " + age + " years old now, how old will I be in " + number + " years?'");
        System.out.println("The " + animal + " thought for a moment and said, 'You will be " + futureAge + " years old!'");
        System.out.println("With that knowledge, " + name + " and " + friendName + " continued their adventure,");
        System.out.println("knowing that the future holds many more exciting encounters. They counted all the stars they saw and reached " + largeNumber + "!");
        System.out.println("The end.");

        // Closing the scanner
        scanner.close();
    }
}
