/**
 * Helps convert from US currency to CN currency and vice versa
 * 
 * @author (Kirk Fay) 
 * @version (April 27, 2017)
 */
public class CurrencyConverter
{
    // instance variables
    private static final int US_TO_CN = 135; 
    private static final int CN_TO_US = 74;

    /** 
     * convert NAMoney 
     * 
     * @param   NAMoney deposit
     * @param   String  AccountKind
     * @return  NAMoney convertedDeposit
     */
    public static NAMoney convertNAMoney (NAMoney deposit, String accountKind)
    {
        if (accountKind.equals (deposit.getKind()))
            return deposit; 
        else { 
            int factor; 
            if (accountKind.equals ("US")) 
                factor = CN_TO_US; 
            else 
                factor = US_TO_CN; 
            int dollars = deposit.getDollars(); 
            int cents = deposit.getCents(); 
            int convertedCents = (100 * dollars + cents) * factor / 100; 
            return new NAMoney (0, convertedCents, accountKind); 
        }
    }
}
