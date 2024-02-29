import java.util.Scanner;
public class converting
{
    public static void main(String[] args)
    {
       //declare a constant for the conversion factor
       final double KM_PER_MILE = 1.60935;

       //declare variables for miles and kilometers
       double miles, kilometers;

       //create a Scanner object for user input
       Scanner scan = new Scanner(System.in);

       //ask the user for the miles value
       System.out.println("Enter the miles value:");

       //read the input as a double
       miles = scan.nextDouble();

       //convert miles to kilometers using the formula
       kilometers = miles * KM_PER_MILE;
       
       //display the result with one decimal place
       System.out.printf("%.1f miles is equal to %.1f kilometers", miles, kilometers);
    }
}
