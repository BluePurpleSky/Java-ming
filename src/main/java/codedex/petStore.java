import java.util.Scanner;

public class petStore {
    public static void main(String[] args) {
        boolean isCatOwner = true;
        System.out.println("We have Offer for you!");
        System.out.println("Are you a cat owner? Y or N");

        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine().toLowerCase();
        // checks if the input is true
        isCatOwner = result.equals("y");



        if (isCatOwner) {
            System.out.println("20% off select cat items with code MEOW2025");
        }
        else
        System.out.println("Welcome to the Pets Pets Pets store!");




    }
}

/*
The pet store wants to send you a coupon if you're a cat owner!

Write a program with a isCatOwner variable, either true or false.

If true, print "20% off select cat items with code MEOW2025".
Otherwise, print a generic "Welcome to the Pets Pets Pets store!" message
 */