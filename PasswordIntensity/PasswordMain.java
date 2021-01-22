/**
 * @author szebe
 */
package passwordintensity;

import java.util.Scanner;

public class PasswordMain {

	public static void main(String[] args) {

		/**
		 * calculate the intensity of password
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a password: ");

		String password = scanner.nextLine();

		PasswordIntensity intensity = new PasswordIntensity(password);

		intensity.checkPasswordIntensity(password);

	}

}
