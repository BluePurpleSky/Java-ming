import java.util.Scanner;

public class petStore {
    public static void main(String[] args) {
        // Prompt the user
        System.out.println("We have an offer for you!");
        System.out.println("Are you a cat owner? Y or N");

        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        String result = sc.nextLine().trim().toLowerCase(); // Read input and normalize it

        // Set isCatOwner based on the user's response
        boolean isCatOwner = result.equals("y");

        // Display appropriate messages
        if (isCatOwner) {
            System.out.println("20% off select cat items with code MEOW2025");
        } else {
            System.out.println("Welcome to the Pets Pets Pets store!");
        }

        sc.close(); // Close the scanner
    }
}
/*
The pet store wants to send you a coupon if you're a cat owner!

Write a program with a isCatOwner variable, either true or false.

If true, print "20% off select cat items with code MEOW2025".
Otherwise, print a generic "Welcome to the Pets Pets Pets store!" message
 */