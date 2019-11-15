
/**
 * The purpose of this class is to keep track of time intervals for activities.
 * 
 * @author (Kirk Fay) 
 * @version (March 30,2017)
 */
public class Itime
{
    // instance variables - replace the example below with your own
    int minutes;
    double seconds;
    /**
     * Constructor for objects of class Itime
     */
    public Itime(int minutes, double seconds)
    {
        // initialise instance variables
        assert(0 <= minutes && seconds >= 0 && seconds < 60);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * Getter method
     *     
     */
    public int getMinutes(){return minutes;}
    /**
     * Getter method
     */
    public double getSeconds(){return seconds;}

    /**
     * This method concatenates the minutes and the seconds and returns them as a String
     */
    public String toString(){
        return (minutes + "minutes and " + seconds + "seconds");
    }

    /**
     * This method adds the time value represented by the object on which the method is invoked
     * with that of the parameter passed.
     * 
     * @param      Itime
     * @return     Itime 
     */
    public Itime addTime(Itime bTime){
        int totalMinutes;
        double totalSeconds;
        totalMinutes = this.minutes + bTime.getMinutes();
        totalSeconds = this.seconds + bTime.getSeconds();
        if (totalSeconds >= 60){
            totalSeconds = totalSeconds - 60;
            totalMinutes ++;
        }
        Itime totalTime = new Itime(totalMinutes, totalSeconds);
        return totalTime;
    }
}
