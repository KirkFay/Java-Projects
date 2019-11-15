/**
 * The purpose of this program is to read a string,and convert the given hex value to decimal
 * 
 * @author (Kirk Fay) 
 * @version (March 9, 2017)
 */
import java.util.Scanner;
public class HexProcessor
{
    public static void main (String[] args)
    {
        char response; // user response to continue or not
        String str;  // input String from user 
        int decimal;   // decimal value computed
        Scanner input = new Scanner (System.in); // to read user input
        
        // display purpose
        System.out.println ("The purpose of this program is to read a hexadecimal" 
        + "\nnumber as a string and convert it to its equivalent decimal representation.\nThe input is assumed to be"
        + "a valid hexadecimal number; no error checking will be performed."); 
        System.out.println ("Author: Kirk Fay; Version: March 9, 2017");    
        System.out.println (); // print blank line
        // prompt to see if user wants to run the program 
        System.out.print ("Want to run? (enter y to run): "); 
        response = input.next().charAt(0); 
        System.out.println (); // print blank line
        while (response == 'y' || response == 'Y') { 
            System.out.print ("Enter a valid hexadecimal number: "); 
            str = input.next(); 
            decimal = Hex.parseInt(str);
            System.out.print("The equivalent decimal value is " + decimal);
            System.out.println (); // print blank line

            // prompt to see if user wants to tun the program 
            System.out.print ("Want to run? (enter y to run): "); 
            response = input.next().charAt(0); 
            System.out.println (); // print blank line
        }
        System.out.println ("Program has terminated."); 
        System.out.println (); // print blank line
    }  
}