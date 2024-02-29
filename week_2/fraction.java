import java.util.Scanner;
public class fraction
{
    public static void main(String[] args)
    {
       //declare variables for the numerator, denominator, and decimal of the fraction
       int numerator, denominator;
       double decimal;

       //create a Scanner object for user input
       Scanner scan = new Scanner(System.in);

       //ask the user for the numerator of the fraction
       System.out.println("Enter the numerator of the fraction:");

       //read the input as an int
       numerator = scan.nextInt();

       //ask the user for the denominator of the fraction
       System.out.println("Enter the denominator of the fraction:");

       //read the input as an int
       denominator = scan.nextInt();

       //convert the fraction to decimal using the formula
       decimal = (double) numerator / denominator;

       //display the result with two decimal places
       System.out.printf("The decimal equivalent of %d/%d is %.2f", numerator, denominator, decimal);
    }
}
