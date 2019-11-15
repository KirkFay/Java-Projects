/**
 * Handles Hexadecimal numbers and converts them to decimal values 
 * 
 * @author (Kirk Fay) 
 * @version (March 9,2017)
 */
public class Hex
{
    /**
     * Compute the decimal value of a valid hexadecimal string 
     * 
     * @param   roman   a String 
     * @return  int     decimal value of the hexadecimal string
     */
    public static int parseInt (String hex)
    {
        int decimalValue; // final result
        int len; // length of the string 
        int index; // to step through the string 
        char currentChar; 
        int valueOfCurrentChar, valueOfPrevChar;

        // change to all uppercase and determine length
        hex = hex.toUpperCase();
        len = hex.length(); 

        // process first character
        currentChar = hex.charAt(0); 
        valueOfCurrentChar = Hex.value(currentChar); 
        decimalValue = valueOfCurrentChar; 

        // process the rest, one char at a time
        valueOfPrevChar = 0;
        for (index = 0; index < len; index++) {
            currentChar = hex.charAt(index); 
            valueOfCurrentChar = Hex.value(currentChar);
            valueOfCurrentChar = (valueOfPrevChar * 16 + valueOfCurrentChar);
            valueOfPrevChar = valueOfCurrentChar;                              
        }
        decimalValue = valueOfCurrentChar;
        return decimalValue;
    }

    /**
     * Compute the decimal value of a single Hex character 
     * 
     * @param   roman   a character 
     * @return  int     decimal value of the Hex character
     */
    //gives the value of the Hex Character in decimal form
    private static int value (char hexChar) {
        int valueOfChar; 
        switch (hexChar) {
            case '0': valueOfChar = 0; break;
            case '1': valueOfChar = 1; break;
            case '2': valueOfChar = 2; break;
            case '3': valueOfChar = 3; break;
            case '4': valueOfChar = 4; break;
            case '5': valueOfChar = 5; break;
            case '6': valueOfChar = 6; break;
            case '7': valueOfChar = 7; break;
            case '8': valueOfChar = 8; break;
            case '9': valueOfChar = 9; break;
            case 'A': valueOfChar = 10; break; 
            case 'B': valueOfChar = 11; break; 
            case 'C': valueOfChar = 12; break; 
            case 'D': valueOfChar = 13; break; 
            case 'E': valueOfChar = 14; break; 
            case 'F': valueOfChar = 15; break; 
            default:  valueOfChar =  0; break; 
        }
        return valueOfChar;   
    }
}