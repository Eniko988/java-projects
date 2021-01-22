/**
 * @author szebe
 */
package reverseorderedlist;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	/**
	 * Compares its two arguments for order. A negative integer, zero, or a positive
	 * integer as the first argument is less than, equal to, or greater than the
	 * second.
	 */
	@Override
	public int compare(String string1, String string2) {

		int number = string1.compareTo(string2);

		return number * -1;

	}
}
