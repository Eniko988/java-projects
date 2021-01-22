/**
 * 
 * @author szebe
 */

package fibonaccinumber;

public class FibonacciNumber {

	public static final FibonacciNumber FIRST_FIB_NUMBER = new FibonacciNumber(1, 0);

	private int currentValue;
	private int previousValue;

	/**
	 * constructor
	 */
	private FibonacciNumber(int currentValue, int previousValue) {

		this.currentValue = currentValue;
		this.previousValue = previousValue;
	}

	/**
	 * method which calculate the first ten fibonacci numbers
	 */

	public FibonacciNumber next() {

		FibonacciNumber next = new FibonacciNumber(currentValue + previousValue, currentValue);

		return next;

	}

	public String toString() {
		return "" + currentValue;
	}

}
