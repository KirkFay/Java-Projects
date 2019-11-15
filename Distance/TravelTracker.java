
/**
 * The purpose of this program is to track distances in miles, yards and feet covered in a trip.
 * 
 * @author (Kirk Fay) 
 * @version (April 13, 2017)
 */
import java.util.*;
public class TravelTracker
{
    public static void main (String[] args){
        // instance variables
        Distance totalDistance;
        Distance activityDistance;
        int miles; int yards; int feet;
        Scanner input = new Scanner(System.in);
        //Display purpose of program
        System.out.println("The purpose of this program is to track distances in miles,"
            + "\nyards, and feet covered in a trip. Invalid values lead to error messages.");
        System.out.println("Author: Kirk Fay\tVersion: April 13, 2017");
        System.out.println(); //print blank line

        //Specify format for input
        System.out.println("Enter distance in miles, yards, and feet, all in a single line\nwith spaces in between."
            + " Entering all zeros will teminate the program.");
        System.out.print("Enter values to be passed: ");
        System .out .println(); //print blank line
        //create totalDistance object of type Distance with int 0 for all parameters
        totalDistance = new Distance(0,0,0);
        activityDistance = new Distance(0,0,0);
        System.out.println("Distance covered so far is: " + totalDistance.toString());
        System.out.println(); // print blank line
        System.out.print("Enter distance covered for a day: ");
        miles = input.nextInt();
        yards = input.nextInt();
        feet = input.nextInt();
        //intial check if input is valid
        while (miles != 0 || yards != 0 || feet != 0) {
            //check of input is in valid range
            if(Distance.isValidDistance(miles,yards,feet) == true){
                // create the activityDistance object of type Distance with given miles and yards
                activityDistance = new Distance(miles,yards,feet);
                // add totalDistance and activityDistance and put the result in totalDistance
                totalDistance = activityDistance.addDistance(totalDistance);
                System.out.println ("Distance covered so far is: " + totalDistance.toString()); 
                System.out.println ();  // print blank line
                // prompt and read time for another activity
                System.out.print ("Enter distance covered for a day: ");   
                miles = input.nextInt();
                yards = input.nextInt();
                feet = input.nextInt();  
            }
            else{
                System.out.println("**Invalid value. Not Processed.");
                // prompt and read time for another activity
                System.out.print ("Enter distance covered for a day: ");   
                miles = input.nextInt();
                yards = input.nextInt();
                feet = input.nextInt();
                System.out.println(); // print blank line
            }
        }
        //Terminate the program
        System.out.println("Program Terminated.");
    }
}