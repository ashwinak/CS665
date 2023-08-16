package cs665.simplifying.conditional.after;

public class Product {

	private String name;
	private String productID;
	private Double setUnitPrice;
	private int quantity;
	private boolean isRare;
	private boolean isSeasonal;
	private boolean isLuxury;

	// Returns the total price for an order of this product.
	public double getTotalPrice() {
		double baseProductPrice = setUnitPrice * quantity;

		if (isLuxury && isSeasonal)
			return baseProductPrice * 1.2;

		if (isLuxury && !isSeasonal && isRare)
			return baseProductPrice * 1.5;

		if (isLuxury && !isSeasonal && !isRare)
			return baseProductPrice * 1.3;

		return baseProductPrice;
	}

	// The above implementation is better understandable.
	// HERE we should be careful that we have implemented the same algorithm.
	// BEFORE it was

	// Returns the total price for an order of this product.
	// the Following algorithm looks complex and not understandable.
	// public double getTotalPrice() {
	// double baseProductPrice = setUnitPrice * quantity;
	//
	// double result;
	// if (isLuxury) {
	// if (isSeasonal) {
	// result = baseProductPrice * 1.2;
	// } else {
	// if (isRare) {
	// result = baseProductPrice * 1.5;
	// } else {
	// result = baseProductPrice * 1.3;
	// }
	// }
	// } else {
	// result = baseProductPrice;
	// }
	// return result;
	// }

	// Here are the Getter and Setter Methods
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the productID
	 */
	public String getProductID() {
		return productID;
	}

	/**
	 * @param productID
	 *            the productID to set
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}

	/**
	 * @return the setUnitPrice
	 */
	public Double getSetUnitPrice() {
		return setUnitPrice;
	}

	/**
	 * @param setUnitPrice
	 *            the setUnitPrice to set
	 */
	public void setSetUnitPrice(Double setUnitPrice) {
		this.setUnitPrice = setUnitPrice;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
