
package reverseorderedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class ReverseOrderedSet {

	// Feladat: Készítsünk egy olyan rendezett String halmazt, ami fordított ABC sorrendben tárolja az elemeit.

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		StringComparator comparator = new StringComparator();
		List<String> strings = new ArrayList<String>();

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter " + i + ". letter: ");

			String string = scanner.nextLine();

			if (strings.contains(string)) {
				strings.remove(string);
			} else {
				strings.add(string);
			}
			Collections.sort(strings, comparator);

			System.out.println(strings);
		}

	}
}
