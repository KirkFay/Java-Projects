/**
 * Used to track total time for a series of activities.
 * 
 * @author (Kirk Fay) 
 * @version (March 30, 2017)
 */
import java.util.*;
public class ActivityManager
{
    public static void main(String[] args) 
    {
        // declare totalTime and activityTime of type Itime 
        Itime totalTime;
        Itime activityTime;
        int minutes; double seconds; // user input values
        Scanner input = new Scanner (System.in); // to read user input

        // display purpose 
        System.out.println ("The purpose of this program is to track" 
            + " time in minutes"); 
        System.out.println ("and seconds for a series of activities."); 
        System.out.println ("Author: Kirk Fay\tVersion: March 30, 2017");
        System.out.println ();  // print blank line 
 
        // specify format for input 
        System.out.println ("Enter activity time in minutes and" 
            + " seconds, all in a");   
        System.out.println ("single line with spaces in between.  Entering" 
            + " values" ); 
        System.out.println ("outside appropriate ranges will terminate"
            + " the program."); 
        System.out.println ();  // print blank line

        // create the totalTime object of type Itime with 0 minutes and 0.0 seconds
        totalTime = new Itime(0,0.0);
        System.out.println ("Total time so far is: "
            + totalTime.toString()); 
        System.out.println ();  // print blank line

        // prompt and read time for an activity 
        System.out.print ("Enter time for an activity: ");   
        minutes = input.nextInt(); 
        seconds = input.nextDouble();

        // Accumulate if appropriate 
        while (minutes >= 0 && seconds >= 0 && seconds < 60) {
            // create the activityTime object of type Itime with given minutes and seconds
            activityTime = new Itime(minutes,seconds);
            // add totalTime and activityTime and put the result in totalTime
            totalTime = activityTime.addTime(totalTime);
            System.out.println ("Total time so far is: "
                + totalTime.toString()); 
            System.out.println ();  // print blank line

            // prompt and read time for another activity
            System.out.print ("Enter time for an activity: ");   
            minutes = input.nextInt(); 
            seconds = input.nextDouble(); 
        }
        
        // wrap up and print final total
        System.out.println ("Sentinel received"); 
        System.out.println ();  // print blank line 
        System.out.println ("Total time so far is: "
            + totalTime.toString()); 
        System.out.println ("Program terminated."); 
        System.out.println ();  // print blank line 
    }        
}