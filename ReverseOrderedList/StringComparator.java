
package reverseorderedlist;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String string1, String string2) {

		int number = string1.compareTo(string2);

		return number * -1;

	}
}
