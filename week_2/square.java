import java.util.Scanner;
public class square
{
    public static void main(String[] args)
    {
       //declare variables for the side, perimeter, and area of the square
       int side, perimeter, area;

       //create a Scanner object for user input
       Scanner scan = new Scanner(System.in);

       //ask the user for the length of the square's side
       System.out.println("Enter the length of the square's side:");

       //read the input as an int
       side = scan.nextInt();

       //calculate the perimeter and area using the formulas
       perimeter = 4 * side;
       area = side * side;
       
       //display the results
       System.out.println("The perimeter of the square is " + perimeter);
       System.out.println("The area of the square is " + area);
    }
}
