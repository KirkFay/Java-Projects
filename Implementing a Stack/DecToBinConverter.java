package stack;

/**
 * This class will take in numbers that are larger than 0
 * @author Kirk Fay
 * @version 10/26/17
 *
 */
import java.util.*;

public class DecToBinConverter {

	public static void printInBinary(int n) {
		int digit;
		int Rem;
		Stack<Integer> S = new Stack<Integer>();
		while (n > 0) {
			Rem = n % 2;
			S.push(Rem);
			n = n / 2;
		}
		while (!S.isEmpty()) {
			digit = S.pop();
			System.out.println(digit);
		}
	}
}
