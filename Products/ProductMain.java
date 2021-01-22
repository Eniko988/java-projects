/**
 * @author szebe
 */
package products;


public class ProductMain {
	
	/**
	 * In the main method, create some products to make sure the program works correctly.
	 */

	public static void main(String[] args) {

		try {
			Food food = new Food("123", "apple cake", new String[] { "apple", "sugar", "eggs", "floor" });
			System.out.println(food.description());

			Electronics electronics = new Electronics("1234", "vacuum cleaner", 3);
			System.out.println(electronics.description());

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());

		}

	}
}
