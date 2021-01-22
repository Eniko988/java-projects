/**
 * @author szebe
 */
package passwordintensity;

public class PasswordIntensity {

	private String password;
	private int passwordIntensity;

	private static final int POINT_OF_LOWERCASE = 10;
	private static final int POINT_OF_UPPERCASE = 15;
	private static final int POINT_OF_DIGIT = 25;
	private static final int POINT_OF_OTHER_CHARACTER = 50;

	public PasswordIntensity(String password) {
		this.password = password;

	}

	/**
	 * 
	 * calculate the intensity of password
	 */
	public void checkPasswordIntensity(String password) {
		char[] character = password.toCharArray();

		if (character.length < 5) {
			this.passwordIntensity = 0;
			System.out.println("Password intensity: " + this.passwordIntensity);
		} else {
			for (int i = 0; i < character.length; i++) {

				if (Character.isLowerCase(character[i])) {
					passwordIntensity += this.POINT_OF_LOWERCASE;

				} else if (Character.isUpperCase(character[i])) {
					passwordIntensity += this.POINT_OF_UPPERCASE;
				} else if (Character.isDigit(character[i])) {
					passwordIntensity += this.POINT_OF_DIGIT;

				} else {
					passwordIntensity += this.POINT_OF_OTHER_CHARACTER;

				}

			}
			int result = passwordIntensity / character.length;
			System.out.println("Password intensity: " + result);

		}
	}

}
