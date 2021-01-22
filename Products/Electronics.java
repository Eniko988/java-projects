/**
 * @author szebe
 */
package products;

public class Electronics extends Product {

	/**
	 * In the case of electronic products, we store the number of warranty years.
	 */
	private int warrantee;

	public Electronics(String id, String name, int warrantee) {
		super(id, name);
		this.warrantee = warrantee;
	}

	/**
	 * The description() method gives a short description to the product. In the
	 * case of electronics, returns ELTX- <id> <name> (<warranty>-year warranty) Do
	 * not display the warranty section if there is no warranty.
	 */

	@Override
	public String description() {
		String warantee = "";
		if (this.warrantee != 0) {
			warantee = "(" + this.warrantee + "-year warranty" + ")";
		}
		return "ELTX-" + super.toString() + " " + super.name + " " + warantee;
	}

}
