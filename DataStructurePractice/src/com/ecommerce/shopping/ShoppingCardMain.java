package com.ecommerce.shopping;

import java.util.HashMap;
import java.util.Map;

/**
 * This is main entry point for ShpooingKart application
 * @author Deepika Vashishtha
 *
 */
public class ShoppingCardMain {
	 Map<Integer, Product> productMetadata = new HashMap<>();
	 
	 
	public static void main(String[] args) {
		ShoppingCardMain shoppingCardMain = new ShoppingCardMain();
		Customer customer1=  new Customer(1, "Jane");
		ShoppingKart shoppingKart1 = new ShoppingKart(customer1.getId());
		//Initializing ProductMetadata
		initProduct(shoppingCardMain);
				
		//Adding products for customer
		shoppingKart1.addProduct(1, 2);
		shoppingKart1.addProduct(2, 4);
		shoppingKart1.addProduct(3, 3);
		shoppingKart1.addProduct(7, 1);
		shoppingKart1.addProduct(10, 7);
		
		//removing products for customer
		shoppingKart1.removeProduct(1, 1);
		shoppingKart1.removeProduct(5, 6);
		shoppingKart1.removeProduct(2, 7);
		shoppingKart1.removeProduct(10, 3);
		
		//Total price of products inShoppingKart
		shoppingKart1.getTotal(shoppingCardMain.productMetadata);
	}


	private static void initProduct(ShoppingCardMain shoppingCardMain) {
		shoppingCardMain.productMetadata.put(1, new Product(1, 2));
		shoppingCardMain.productMetadata.put(3, new Product(3, 6));
		shoppingCardMain.productMetadata.put(5, new Product(5, 8.5f));
		shoppingCardMain.productMetadata.put(8, new Product(8, 5.5f));
		shoppingCardMain.productMetadata.put(2, new Product(2, 2));
		shoppingCardMain.productMetadata.put(4, new Product(4, 6));
		shoppingCardMain.productMetadata.put(6, new Product(6, 8.5f));
		shoppingCardMain.productMetadata.put(7, new Product(7, 5.5f));
		shoppingCardMain.productMetadata.put(9, new Product(9, 8.5f));
		shoppingCardMain.productMetadata.put(10, new Product(10, 5.5f));
	}

}
