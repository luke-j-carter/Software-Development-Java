import java.util.Arrays;
import java.util.Scanner;

public class Register
{
    //I created an array to initialize the denominations
    public static final Denomination[] Array =
    {
        new Denomination("Hundred-Dollar Note", 100.0, "bill", "images/hundred_note.png"),
        new Denomination("Fifty-Dollar Note", 50.0, "bill", "images/fifty_note.png"),
        new Denomination("Twenty-Dollar Note", 20.0, "bill", "images/twenty_note.png"),
        new Denomination("Ten-Dollar Note", 10.0, "bill", "images/ten_note.png"),
        new Denomination("Five-Dollar Note", 5.0, "bill", "images/five_note.png"),
        new Denomination("One-Dollar Note", 1.0, "bill", "images/one_note.png"),
        new Denomination("Quarter", 0.25, "coin", "images/quarter.png"),
        new Denomination("Dime", 0.10, "coin", "images/dimes.png"),
        new Denomination("Nickel", 0.05, "coin", "images/nickel.png"),
        new Denomination("Penny", 0.01, "coin", "images/penny.png")
    };

    //This method determines how many of each denomination are required to make up the total
    public Purse makeChange(double amount) {
        Purse newPurse = new Purse();

        for (Denomination denomination : Array) {
            int count = (int) (amount / denomination.amt());
            if (count > 0) {
                newPurse.add(denomination, count);
                amount -= count * denomination.amt();
            }
        }

        return newPurse;
    }

    //Main method that prompts the user for an amount and displays the change using the makeChange function
    public static void main(String[]args)
    {
        Register r = new Register();

        System.out.println("Welcome! \nPlease enter an amount to show the lowest amount of bills and coins: ");
        Scanner sc = new Scanner(System.in);
        double userInput = sc.nextDouble();

        Purse total = r.makeChange(userInput);

        System.out.println("The amount of change for $" + total.getValue() + " is\n" + total);
        if(userInput <= 0)
        {
            System.out.print("Empty Purse\n");
        }

    }

}
