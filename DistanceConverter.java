/**
 * The purpose of this program is to convert distance expressed in miles to kilometers. It prompts 
 * the user for a distance value in miles. If a negative value is entered, it is considered invalid and an appropriate
 * message is printed. For a positive value enetered, required conversion is performed and the result is printed out.
 * 
 * @author (Kirk Fay)
 * @version (January 26, 2017)
 */
import java.util.Scanner;
public class DistanceConverter
{
    public static void main (String[] args)
    {
        final double KM_PER_MILE = 1.609344; //conversion factor
        double miles, kilometers; //distance values    
        char response; // user response to continue or not
        Scanner input = new Scanner (System.in); // read user input
        
        //display purpose, author, and version
        System.out.println ("The purpose of this program is to convert"
            + " distances in miles");
        System.out.println ("to Kilometers. Negative input"
            + "values lead to error messages.");
        System.out.println ("Author: Kirk Fay\tVersion: January 26, 2017");
        System.out.println ();  //print blank line
        
        //prompt to see if user wants to run the program
        System.out.print ("Want to run? (enter y to run): ");
        response = input.next().charAt(0);
        System.out.println (); //print blank line
        
        while (response == 'y' || response == 'Y'){
            System.out.print ("Enter the distance in miles: ");
            miles = input.nextDouble();
            //convert only if positive
            if (miles < 0)
                System.out.println ("Negative distance value is not valid.");
            else {
                kilometers = miles * KM_PER_MILE;
                System.out.println ("That equals " + kilometers
                    + " kilometers.");
            }
            System.out.println(); //print blank line
            
            //prompt to see if the user wants to run the program
            System.out.print ("Want to run? (enter y to run): ");
            response = input.next().charAt(0);
            System.out.println (); // print blank line
        }
        System.out.println ("Program has terminated.");
        System.out.println (); //print blank line    
    }
}