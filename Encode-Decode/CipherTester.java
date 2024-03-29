/**
 * The purpose of this program is to test the CaesarCipher class 
 * with encrypt and decrypt methods.  
 * 
 * @author (Kirk Fay) 
 * @version (March 02, 2017)
 */
import java.util.*; 
public class CipherTester
{
    public static void main (String[] args)
    {
        int key;       // key for shift 
        CaesarCipher sender, receiver;         
        String plainText, cipherText; 
        char response; // user response to continue or not 
        Scanner input = new Scanner (System.in); // to read user input

        // display purpose
        System.out.println ("The purpose of this program is to test"
            + " the CaesarCipher class"); 
        System.out.println ("with encrypt and decrypt methods."); 
	System.out. println ("Author: Kirk Fay\tVersion: March 02, 2017");
        System.out.println (); // print blank line

        // prompt to see if user wants to run the program 
        System.out.print ("Want to run? (enter y to run): "); 
        response = input.next().charAt(0); 
        System.out.println (); // print blank line

        while (response == 'y' || response == 'Y') { 
            System.out.println ("Enter non-negative int key "
                + "and input string, all in one line"); 
            key = input.nextInt(); // read int value for key
            plainText = input.nextLine(); // read input string
            System.out.println (); // print blank line
            // create sender and receiver                
            sender = new CaesarCipher(key);
            receiver = new CaesarCipher(key);
            System.out.println ("Input to sender:    " + plainText); 
            // Make the sender encrypt plainText and assign the returned String to cipherText
            cipherText = sender.encrypt(plainText);        
            System.out.println ("Output of sender:   " + cipherText); 
            System.out.println ("Sender transmits encrypted text to receiver"); 
            System.out.println ("Input to receiver:  " + cipherText); 
            // Make the receiver decrypt ciphertext and assign the returned String to plainText
            plainText=receiver.decrypt(cipherText);
            System.out.println ("Output of receiver: " + plainText); 
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