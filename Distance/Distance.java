
/**
 * The purpose of this program is to track distances in miles, yards and feet covered in a trip.
 * 
 * @author (Kirk Fay) 
 * @version (April 13, 2017)
 */
public class Distance
{
    public static final int YARDS_IN_MILE = 1760;
    public static final int FEET_IN_YARD = 3;
    // instance variables
    private int miles, yards, feet; 

    /**
     * Constructor for objects of class Distance
     */
    public Distance(int miles, int yards, int feet)
    {
        // initialise instance variables
        this.miles = miles;
        this.yards = yards;
        this.feet = feet;

    }

    public static boolean isValidDistance (int miles, int yards, int feet){
        return  (feet >= 0 && feet < FEET_IN_YARD && yards >= 0 && yards < YARDS_IN_MILE && miles >= 0); 

    }

    public int getMiles(){return this.miles;}

    public int getYards(){return this.yards;}

    public int getFeet(){return this.feet;}

    public Distance addDistance(Distance newDistance){
        int totalMiles;
        int totalYards;
        int totalFeet;
        totalMiles = this.miles + newDistance.getMiles();
        totalYards = this.yards + newDistance.getYards();
        totalFeet = this.feet + newDistance.getFeet();
        Distance Distance1;
        if (totalYards >= YARDS_IN_MILE){
            totalYards = totalYards % 1760;
            totalMiles ++;
        }
        if (totalFeet >= FEET_IN_YARD){
            totalFeet = totalFeet % 3;
            totalYards ++;
        }
        Distance1 = new Distance(totalMiles, totalYards, totalFeet);
        return (Distance1);
        
    }

    public String toString(){
        return (this.miles + "m:" + this.yards + "y:" + this.feet + "f");
    }
}