
/**
 * Write a description of class Student here.
 *
 * @author (Kirk Fay)
 * @version (May 04, 2017)
 */
import java.text.*;
public class Student
{
    // instance variables
    private String bannerID;
    private String name;
    private int creditsCompleted;
    private double cumulativeGPA;

    /**
     * Constructor for objects of class Student
     */
    public Student(String bannerID, String name, int creditsCompleted, double cumulativeGPA)
    {
        // initialise instance variables
        this.bannerID = bannerID;
        this.name = name;
        this.creditsCompleted = creditsCompleted;
        this.cumulativeGPA = cumulativeGPA;
    }
    //getter methods
    public String getBannerID(){return bannerID;}

    public String getName(){return name;}

    public int getCreditsCompleted(){return creditsCompleted;}

    public double getCumulativeGPA(){return cumulativeGPA;}

    /**
     * Returns the Student method variables in the form of a string
     * @param   none
     * @return   String
     */
    public String toString(){
        DecimalFormat cumulativeGPAFormatter = new DecimalFormat ("0.00");
        DecimalFormat creditsCompletedFormatter = new DecimalFormat ("00.00");
        String result = "";
        result = result + cumulativeGPAFormatter.format(cumulativeGPA) + "\t"
        + creditsCompletedFormatter.format(creditsCompleted) + "\t" + getBannerID() + "\t" + getName();
        return result;
    }
}
