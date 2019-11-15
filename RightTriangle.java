/**
 * The purpose of this program is to read three integers, check 
 * if they form the sides of a valid triangle, and if they do, 
 * report whether or not they also form a right-angled triangle.
 * 
 * @author (Kirk Fay) 
 * @version (February 16, 2017)
 */
import java.util.Scanner;
public class RightTriangle
{
    public static void main (String[] args)
    {
        int side1, side2, side3; // three sides 
        int temp; // used in swap
        char response; // user response to continue or not
        Scanner input = new Scanner (System.in); // to read user input

        // display purpose and author
        System.out.println ("The purpose of this program is to read three numbers and check if they make a valid triangle.");
        System.out.println ("If they do, then the program checks for if it's a right triangle.");
        System.out.println ("Author: Kirk Fay\t");
        System.out.println (); // print blank line

        // prompt to see if user wants to run the program 
        System.out.println ("Want to run the program? (enter y to run): ");
        System.out.println (); // print blank line
        response = input.next().charAt(0);
        while (response == 'y' || response == 'Y') { 
            // prompt and read three integer sides, one by one 
            System.out.print("Enter the first side: ");
            side1 = input.nextInt();
            System.out.print("Enter the second side: ");
            side2 = input.nextInt();
            System.out.print("Enter the third and final side: ");
            side3 = input.nextInt();
            // if (side1 > side3) swap them
            if (side1 > side3) {
                temp = side1;
                side1 = side3;
                side3 = temp; 
            }
            // if (side2 > side3) swap them
            if (side2 > side3) {
             temp = side2;
             side2 = side3;
             side3 = temp;
            }
            // if the triangle condition is met 
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                // if the right-angled triangle condition is met 
                if ( (side1 * side1) + (side2 * side2) == side3 * side3) {   
                    // print valid right triangle 
                    System.out.println("Valid right triangle");
                }
                else {
                    // print valid triangle, not right-angled
                    System.out.println("Valid triangle, not right-angled");
                }
            }
            else { 
                // print not a valid triangle 
                System.out.println("Not a valid triangle");
            }
            System.out.println (); // print blank line
            // prompt to see if user wants to run the program 
            System.out.println("Want to run the program? (enter y to run)");
            response = input.next().charAt(0); 
            System.out.println (); // print blank line
        }

        System.out.println ("Program has terminated."); 
        System.out.println (); // print blank line
    }  
}