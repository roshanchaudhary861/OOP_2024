import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
       int val1, val2, val3;
       double average;
       Scanner scan = new Scanner(System.in) ;

       System.out.println("Enter the first value:");
       val1=scan.nextInt();

       System.out.println("enter the second value ");
       val2=scan.nextInt();
       
       System.out.println("enter the third value ");
       val3=scan.nextInt() ;
       //calculate the average
       average=(val1+val2+val3)/3.0;
       System.out.printf("The average of %d ,%d and %d is : %.1f",val1,val2,val3,average); 
       }
       



    

     


    }
