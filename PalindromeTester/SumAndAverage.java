
import java.util.Scanner;
/**
 * Write a description of class SumAndAverage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumAndAverage
{
   public static double averageOfInputs()
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a series of number");
       double total = 0;
       int count = 0;
       while (scan.hasNextDouble())
       {
           double number = scan.nextDouble();
           
           total += number;
           count++;
        }
       
       double avg = 0;
       if(count> 0 )
       {
           avg = total / count;
        }
        
       return avg ;
    }

}
