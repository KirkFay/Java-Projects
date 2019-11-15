
/**
 * Write a description of class Database here.
 *
 * @author (Kirk Fay)
 * @version (May 04, 2017)
 */
import java.util.*;
import java.io.*;
public class Database
{
    public static void main (String args[]){
        String inFileName; // obtained through keyboard input
        File inFile; // File object to process Student data file 
        Scanner keyboard; // to read user input
        Scanner input; // to read file input 

        Student[] records; // array of possible student records 
        int numStudents; // number of possible students in the input  
        int index; // index for the array

        int creditsComp; // number of completed credits 
        double cumulGPA; // cumulative GPA
        String name; // Student name 
        String bannerID; // banner ID
        Student newStudent; // one Student object 

        // display purpose 
        System.out.println("The purpose of this program is to process a text file containing");
        System.out.println("student information,and generate a report in descending order of GPA.");
        System.out.println("Author: Kirk Fay\tVersion: May 04, 2017");
        System.out.println(); // print blank line 
        // create a Scanner object to handle keyboard input 
        keyboard = new Scanner(System.in);
        // prompt and read file name  
        System.out.print("Enter a file name (show complete path): ");
        inFileName = keyboard.next();
        System.out.println(); // print blank line
        // open data file and read into an array 
        try {
            // create a File object 
            inFile = new File(inFileName);
            // create a Scanner object to handle the file input 
            input = new Scanner(inFile);
            // create an array named careers to hold Major objects (256 components)
            records = new Student[256];
            // initilaize numStudents to zero 
            numStudents = 0;
            // initialize index for the array
            index = 0;
            // process line by line until end 
            while (input.hasNext()) { 
                // read four pieces of information for a Student from the next line of the file 
                bannerID = input.next();
                creditsComp = input.nextInt();
                cumulGPA= input.nextDouble();
                name = input.nextLine();

                // create a new Student object with data obtained from file and call it newStudent
                newStudent = new Student(bannerID, name, creditsComp, cumulGPA);
                // place newStudent in the array  
                records[index] = newStudent;
                // increment numStudents 
                numStudents++;
                // increment index for the array
                index++;
            }
            // close the file
            input.close();
            // sort students array in decreasing order of cumulative GPA
            // use bubble sort code for simplicity
            for (int pass = 0; pass < numStudents-1; pass++) { 
                for (index = numStudents-1; index >= pass+1; index--) {
                    // Compare students of records[index] and 
                    //         students of records[index-1] 
                    // and swap records[index] and records[index-1] if necessary 
                    if(records[index].getCumulativeGPA() > records[index-1].getCumulativeGPA()){
                        Student temp = records[index];
                        records[index] = records[index-1];
                        records[index-1] = temp;
                    }
                }
            }

            // print report  
            System.out.println ("Number of students processed: " 
                + numStudents); 
            System.out.println (); 
            System.out.println ("Below is the list of students in decreasing order of cumulative GPA"); 
            System.out.println ("--------------------------------------------"
                + "---------------------");

            for (index = 0; index < numStudents; index++ ){
                if (records[index].getCumulativeGPA() >= 2.00 && records[index].getCreditsCompleted() >= 120)
                System.out.println(records[index].toString() + "\t" + "Ready to graduate");
                else
                System.out.println(records[index].toString());
            }

            System.out.println ();
            // display closing message 
            System.out.println(); // print blank line
            System.out.println ("Program terminated."); 
        }

        catch (FileNotFoundException exception) {
            System.out.println ("The file " + inFileName 
                + " was not found."); 
            System.out.println(); // print blank line
        }
    }
}