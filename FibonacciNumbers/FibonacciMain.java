/**
 * @author szebe
 */

package fibonaccinumber;

public class FibonacciMain {

	public static void main(String[] args) {

		/**
		 * in this case the method print the (first ten) fibonacci numbers
		 *
		 */
		FibonacciNumber fibNumber = FibonacciNumber.FIRST_FIB_NUMBER;

		System.out.println(fibNumber);
		FibonacciNumber next = fibNumber.next();

		for (int i = 0; i < 10; i++) {
			fibNumber = fibNumber.next();
			System.out.println(fibNumber);

		}

	}

}
