package age;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Movie price and rating part
        System.out.print("Enter the movie price: ");
        double moviePrice = scanner.nextDouble();
        
        System.out.print("Enter the movie rating: ");
        double movieRating = scanner.nextDouble();

        if (moviePrice >= 12 && movieRating == 5) {
            System.out.println("I'm interested in watching the movie");
        } else {
            System.out.println("I am not interested in watching the movie");
        }
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int fare;
        if (age < 11) {
            fare = 3;
        } else if (age > 11 && age < 65) {
            fare = 5;
        } else {
            fare = 3;
        }
        System.out.println("Your fare is: $" + fare);
        scanner.close();
    }
}
