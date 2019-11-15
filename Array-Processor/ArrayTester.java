/**
 * Read a list of integers, remove negatives and print a revised list.
 * 
 * @author (Kirk Fay) 
 * @version (April 04, 2017)
 */
import java.util.Scanner; 
public class ArrayTester
{
    public static void main()
    {
        int listSize = 0; // number of elements in the list 
        int numberOfNegatives = 0; // number of negatives in the list
        int newListSize = 0; // number of elements after removing negatives            
        Scanner input = new Scanner (System.in); // to read user input
        
        // declare list and newList as (references to) arrays of int
        int[] list; int[] newlist; 

        // display purpose
        System.out.println ("The purpose of this program is to read" 
            + " a list of integers,"); 
        System.out.println ("remove negatives, and print a revised list."); 
        System.out.println ("Author: Kirk Fay\tVersion: April 04, 2017");
        System.out.println (); // print blank line

        // prompt and read list size 
        System.out.print ("Enter size of the list, 0 to terminate: "); 
        listSize = input.nextInt(); 
        while (listSize > 0) {
            // create list as an array with listSize components 
            list = new int[listSize];
 
            // invoke readList method to read the list 
            ArrayProcessor.readList(list);

            // invoke negativeCount method and assign to numberOfNegatives
            numberOfNegatives = ArrayProcessor.negativeCount(list);

            System.out.println ("The list has " + numberOfNegatives 
                + " negative values."); 

            // compute and assign newListSize
            newListSize = listSize - numberOfNegatives;

            // check if newListSize is 0; if so, print message
            // else create newList and invoke removeNegatives
            // and print a revised list
            if (newListSize == 0) 
                System.out.println ("After removing negatives, there" 
                    + " are no values left to print."); 
            else { 
                // create newList as an array with newListSize components
                int[] newList = new int[newListSize]; 
                // invoke removeNegatives method to construct newList
                ArrayProcessor.removeNegatives(list,newList);
                // print the revised list
                System.out.println ("After removing negatives, there" 
                    + " are " + newListSize + " values left to print."); 
                // invoke printList method to print newList 
                ArrayProcessor.printList(newList);
            }
            System.out.println (); // print blank line                
            // prompt and read list size 
            System.out.print ("Enter size of the list, 0 to terminate: "); 
            listSize = input.nextInt(); 
        }
 
        System.out.println (); // print blank line 
        System.out.println ("Program terminated.");  
    }
}