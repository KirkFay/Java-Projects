/**
 * Driver class for AlarmClock class.
 * 
 * @author (Kirk Fay) 
 * @version (March 23, 2017)
 */
public class AlarmClockTester
{
    public static void main (String[] args) 
    {
        AlarmClock generalElectric; 

        System.out.println ("Output of Alarm Clock Tester Code."); 
        System.out.println ("Author: Kirk Fay\tVersion: March 23, 2017");
        System.out.println (); 

        // Create a new alarm clock
        generalElectric = new AlarmClock(); 

        // Print the clock and alarm time
        System.out.println ("After creating the clock"); 
        System.out.println ("Current clock time: " + 
            generalElectric.getClockTime()); 
        System.out.println ("Current alarm time: " + 
            generalElectric.getAlarmTime());
        System.out.println ();

        // Set the clock to 8:30 AM and the alarm to 4:00 PM 
        generalElectric.setClock(8, 30, false);
        generalElectric.setAlarm(4, 00, false);
        System.out.println ("After setting the clock to 8:30 AM" + 
            " and the alarm to 4:00 PM"); 
        System.out.println ("Current clock time: " + 
            generalElectric.getClockTime()); 
        System.out.println ("Current alarm time: " + 
            generalElectric.getAlarmTime());
        System.out.println ();

        // Set the Clock to 5:00 PM and the alarm to 8:00 AM 
        generalElectric.setClock(5, 00, false);
        generalElectric.setAlarm(8, 00, true);
        System.out.println ("After setting the clock to 5:00 PM" + 
            " and the alarm to 8:00 AM"); 
        System.out.println ("Current clock time: " + 
            generalElectric.getClockTime()); 
        System.out.println ("Current alarm time: " + 
            generalElectric.getAlarmTime());
        System.out.println ();

        // Set the clock to 4:00 PM and the alarm to 6:00 AM
        generalElectric.setClock(4, 00, false);
        generalElectric.setAlarm(6, 00, true);
         System.out.println ("After setting the clock to 4:00 PM" + 
            " and the alarm to 6:00 AM"); 
        System.out.println ("Current clock time: " + 
            generalElectric.getClockTime()); 
        System.out.println ("Current alarm time: " + 
            generalElectric.getAlarmTime());
        System.out.println ();

        // Closing output 
        System.out.println ("Program terminated."); 
    }
}