/**
 * This program displays the date of Easter Sunday between the years of 1982 and 2048.
 * 
 * @author  (Kirk Fay)
 * @version (February 23, 2017)
 */
import java.util.*;
public class EasterSunday
{
    public static void main(String[] args){
        //Variables used to calculate the date
        int year=0, p, q, r, s, t, d;
        char response;
        System.out.println("This program computes the date for Easter Sunday for any given year in the range 1982-2048.");
        System.out.println("If the year entered is outside the permitted range, it is considered invalid"
            +" and an appropriate message is printed.");
        System.out.println("Author: Kirk Fay; Version February 23, 2017");
        System.out.print("Want to run program? ");
        Scanner input = new Scanner(System.in);
        response = input.next().charAt(0);
        //print null string
        System.out.println();
        //Loop that determines whether the program runs or not
        while (response == 'y' || response == 'Y'){
            System.out.print ("Enter a year (between 1982 and 2048): "); 
            year = input.nextInt();
            //Loop that determines if loop is in the required range
            if (year >= 1982 && year <= 2048){
                //sets variable equal to the correct values
                p = year % 19;
                q = year % 4;
                r = year % 7;
                s = (19 * p + 24) % 30;
                t = (2 * q + 4 * r + 6 * s + 5) % 7;
                d = 22 +  s + t;
                //If the day is less than or equal to 31, then the day is in March
                if (d <= 31){
                    System.out.println("Easter is Sunday, March " + d + " in " + year + "." );
                    System.out.println();
                    System.out.print("Want to run program? ");
                    response = input.next().charAt(0);
                }
                //If the day is greater than 31, 31 is subtracted from the number and the date is in April
                else{
                    d = d - 31;
                    System.out.println("Easter is Sunday, April " + d + " in " + year + ".");
                    System.out.println();
                    System.out.print("Want to run program? ");
                    response = input.next().charAt(0);
                }
            }
            else{
                System.out.println("Years outside the range 1982 to 2048 are not valid.");
                System.out.println();
                System.out.print("Want to run program? ");
                response = input.next().charAt(0);
            }
        }
        System.out.println("Program has terminated.");
        //print null string
        System.out.println();
    }
}
