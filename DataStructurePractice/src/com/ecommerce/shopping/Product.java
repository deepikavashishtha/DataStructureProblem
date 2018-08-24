package com.ecommerce.shopping;

/**
 * This class represents Product.
 * @author Deepika Vashishtha
 *
 */
public class Product {
	private int id;
	private float prise;
	
	public Product(int id, float prise) {
		super();
		this.id = id;
		this.prise = prise;
	}
	public int getId() {
		return id;
	}
	public float getPrise() {
		return prise;
	}
}	
