import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AvgOfThree {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("""
                Welcome!
                This program takes three integers and returns an average.
                Please enter the first integer:
                """);
        int FirstInput = obj.nextInt();
        System.out.println("Please enter the second integer:");
        int SecondInput = obj.nextInt();
        System.out.println("Please enter the third integer:");
        int ThirdInput = obj.nextInt();

        double average = (double) (FirstInput + SecondInput + ThirdInput) /3;

        System.out.println("The average of " + FirstInput + ", " + SecondInput + ", and " + ThirdInput + " is " + average + ".");

    }
}