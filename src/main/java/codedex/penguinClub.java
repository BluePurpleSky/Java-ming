import java.util.Scanner;

public class penguinClub{
    public static void main(String[] args) {
        System.out.println("------ Welcome to Club Penguin ------");

        System.out.println("Disclaimer");
        System.out.println("!!!");

        System.out.println("1 coin is equivalent to $0.0045 USD");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coins you have");
        int coins = sc.nextInt();
        double usd = 0.0045;

        double conversion = coins * usd;
        System.out.println("Your coins : " +coins + " is equivalent to USD = $"+conversion);
    }
}


/*
Club Penguin is a flash game from the early 2010s that rose to popularity and became one of the biggest computer games!
In the game, you were a penguin that waddled around the world with friends and socialized.

The in-game currency in Club Penguin was coins,
where you could buy items and gain coins by playing mini-games and completing missions.


---------

In our challenge,

1 coin in Club Penguin is equal to $0.0045 USD.
Create a program that serves as a conversion calculator,
where a penguin can enter the number of coins they have, and it will return how much money they have in USD!
 */