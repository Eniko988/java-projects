/**
 * @author szebe A shop sells two types of goods: Food and Electronics.
 */
package products;

public abstract class Product {
	/**
	 * The goods (Product) have a unique identifier and a name.
	 */
	protected String id;
	protected String name;
	
	/**
	 * The ID should consist of only 4 characters, we indicate by dropping a
	 * suitable exception in the corresponding place, if we do not specify 4
	 * characters.
	 */

	public Product(String id, String name) {
		this.id = id;
		this.name = name;
		if (id.length() > 4) {
			throw new IllegalArgumentException("The ID should consist of only 4 characters!");
		}
	}

	public abstract String description();
	
	/**
	 * The toString() method always returns the ID of the products.
	 */
	@Override
	public final String toString() {
		return id;
	}

}
