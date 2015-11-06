
import java.util.Scanner;
/**
 * Write a description of class Substring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Substring
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("GGIMMMEEE ");
        String strr = scan.next();
        int i = 0;
        int num = strr.length();
        i = num;
        while(i >= 0)
        {
            System.out.println(strr.substring(i));
            i--;
        }
    }
}
