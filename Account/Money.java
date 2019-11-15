
/**
 * Holds the intial value of the account
 * 
 * @author (Kirk Fay) 
 * @version (April 04, 2017)
 */
public class Money
{
    // instance variables - replace the example below with your own
    protected int dollars;
    protected int cents;

    /**
     * Constructor for objects of class Money
     */
    public Money(int dollars, int cents)
    {
        // initialise instance variables
        this.dollars = dollars;
        this.cents = cents;
        while(this.cents >= 100){
            this.dollars ++;
            this.cents = this.cents - 100;
        }
    }

  public int getDollars(){return dollars;}
  public int getCents(){return cents;}
}
