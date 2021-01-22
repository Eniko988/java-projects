/**
 * @author szebe
 */
package products;

import java.util.Arrays;

public class Food extends Product {


	private String[] ingredients;

	public Food(String id, String name, String[] ingredients) {
		super(id, name);
		this.ingredients = ingredients;

	}
	
/**
 *   print the elements of a String array
 */
	public String printIngredients(String[] ingredients) {
		String variable = "";
		for (String ingredient : ingredients) {
			if (variable == "") {
				variable = variable + ingredient;
			} else {
				variable = variable + ", " + ingredient;
			}
		}
		return variable;

	}

	/**
	 * The description() method gives a short description to the product.
	 * In the case of food, returns FOOD-<id> <name> (<ingredients>)
	 * If no component is specified, this section should not be displayed.
	 */
	@Override
	public String description() {

		return "FOOD-" + super.toString() + " " + super.name + " " + "(" + this.printIngredients(ingredients) + ")";

	}
}
