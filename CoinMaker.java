//Luke Carter
//Exit Ticket: CoinMaker

import java.util.Scanner;

public class CoinMaker {

    public static void main(String[] args) {
        //Create a scanner object
        Scanner myObj = new Scanner(System.in);
        //Output to the user
        System.out.println("""
                Welcome!
                This program takes an amount from the user and displays the minimum amount of coins.
                Enter an amount:""");
        //Input from the user
        double amount = myObj.nextDouble();
        //Call the function to get change
        makeChange(amount);

    }

    public static void makeChange(double amt) {
        //Initialize the different units
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        //While loop that determines quarters
        while(amt>=0.25)
        {
            quarters++;
            amt-=0.25;
        }

        //While loop that determines dimes
        while(amt>=0.10)
        {
            dimes++;
            amt-=0.10;
        }

        //While loop that determines nickels
        while(amt>=0.05)
        {
            nickels++;
            amt-=0.05;
        }

        //While loop that determines pennies
        while(amt>=0.01)
        {
            pennies++;
            amt-=0.01;
        }

        //Outputs the result
        System.out.println("The minimum amount of quarters is " + quarters + ".");
        System.out.println("The minimum amount of dimes is " + dimes + ".");
        System.out.println("The minimum amount of nickels is " + nickels + ".");
        System.out.println("The minimum amount of pennies is " + pennies + ".");

    }
}