/**
 * Converts the value of the account to a string and adds money to the account
 * 
 * @author (Kirk Fay) 
 * @version (April 04, 2017)
 */
public class NAMoney extends Money
{
    // instance variables - replace the example below with your own
    private String kind;    

    /**
     * Constructor for objects of class NAMoney
     */
    public NAMoney(int dollars, int cents, String kind)
    {
        // initialise instance variables
        super(0,0);
        this.dollars = dollars;
        this.cents = cents;
        this.kind = kind;
        while(this.cents >= 100){
            this.dollars ++;
            this.cents = this.cents - 100;
        }

    }
    //getter Method
    public String getKind(){return kind;}
    public String toString(){
        if(kind.equals("US"))
            if (cents < 10){
                return ( "US" + "$" + dollars + ".0" + cents );

            }
            else{
                return ( "US" + "$" + dollars + "." + cents );

            }
        else
        if (cents < 10){
            return ( "CN" + "$" + dollars + ".0" + cents );

        }
        else{
            return ( "CN" + "$" + dollars + "." + cents );

        }

    }

    public NAMoney addMoney(NAMoney newNAMoney){
        int totalDollars, totalCents; 
        String totalKind;
        totalDollars = this.dollars + newNAMoney.getDollars();
        totalCents = this.cents + newNAMoney.getCents();

        totalKind = this.kind;
        while(totalCents >= 100){
            totalDollars ++;
            totalCents = totalCents - 100;
        }
        NAMoney newAmount = new NAMoney(totalDollars, totalCents, totalKind);
        return newAmount;
    }
}
