/**
 *
 * Need an int key for shift in the alphabet.
 *
 * @author (Kirk Fay) 
 * @version (September 5, 2017)
 */
public class EncodeDecode
{
    // private named constants
    private final int ALPHABET_SIZE = 26;
    private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // private instance variables
    private int shiftKey; // shift key supplied to the constructor
    private int effKey;   // effective key value
    private String encodeMap = ""; // used for encrypting
    private String decodeMap = ""; // used for decrypting

    /**
     * Constructor for objects of class with an int key for encode
     */
    public EncodeDecode(int key)
    {
        // set the values for shiftKey and effKey
        shiftKey = key;
        effKey = key % ALPHABET_SIZE;

        // construct encode map
        encodeMap = ALPHABET.substring (effKey, ALPHABET_SIZE) +
                    ALPHABET.substring (0, effKey);

        // construct decode map
        decodeMap = ALPHABET.substring (ALPHABET_SIZE - effKey, ALPHABET_SIZE) +
                    ALPHABET.substring (0, ALPHABET_SIZE- effKey);

    }

    /**
     * Encrypt the plain text using the encode map
     *
     * @param      plainText    a String to be encrypted
     * @return     String       encrypted text
     */
    public String encode (String plainText)
    {
        String encodeText = "";
        int index; // loop control
        char plainCh, plainUpper, cipherCh, cipherUpper;
        int plainPos; // position of plainCh in ALPHABET

        int length = plainText.length();
        for (index = 0; index < length; index++) {
            plainCh = plainText.charAt(index);
            plainUpper = Character.toUpperCase(plainCh);
            plainPos = ALPHABET.indexOf(plainUpper);
            if (plainPos == -1) {
                // plainCh is not in ALPHABET
                cipherCh = plainCh;
            }
            else {
                // plainCh is in ALPHABET
                cipherUpper = encodeMap.charAt(plainPos);
                if (Character.isUpperCase(plainCh))
                    cipherCh = cipherUpper;
                else
                    cipherCh = Character.toLowerCase(cipherUpper);
            }
            encodeText = encodeText + cipherCh;
        }
        return encodeText;
    }

    /**
     * Decrypt the encode text using the decode map
     *
     * @param      encodeText   a String to be decrypted
     * @return     String       decrypted text
     */
    public String decode (String encodeText)
    {
        String plainText = "";
        int index; // loop control
        char plainCh, plainUpper, encodeCh, encodeUpper;
        int encodePos; // position of encodeCh in ALPHABET
        int length = encodeText.length();
        for (index = 0; index < length; index++) {
            encodeCh = encodeText.charAt(index);
            encodeUpper = Character.toUpperCase(encodeCh);
            encodePos = ALPHABET.indexOf(encodeUpper);
            if (encodePos == -1) {
                // encodeCh is not in ALPHABET
                encodeCh = encodeCh;
            }
            else {
                // encodeCh is in ALPHABET
                encodeUpper = decodeMap.charAt(encodePos);
                if (Character.isUpperCase(encodeCh))
                    encodeCh = encodeUpper;
                else
                    encodeCh = Character.toLowerCase(encodeUpper);
            }
            plainText = plainText + encodeCh;
        }
        return plainText;
    }
}
