package stack;

/**
 * This class will test the DecToBinConverterTester Class
 *
 * @author Kirk Fay
 * @version 10/26/17
 */
public class DecToBinCoverterTester {
	public static void main (String[] args){
		Integer[] numbers = { 	new Integer(23),
				new Integer(47),
				new Integer(257),
				new Integer(1023),
				new Integer(0),
				new Integer(82),
				new Integer(512),
				new Integer(100),
				new Integer(2049)
				     };

		for (int k = 0; k < numbers.length; k++){
			System.out.println(numbers[k]);
			DecToBinConverter.printInBinary(numbers[k]);


		}
	}
}
