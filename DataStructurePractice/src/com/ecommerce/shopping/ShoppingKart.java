package com.ecommerce.shopping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/**
 * This is ShoppingKart class. There is one to one relationship between customer and ShopingKart.
 * This class can be used to shopping operations like: Buy and remove items from ShoppingKart and getTotalprise 
 * 
 * @author Deepika Vashishtha
 *
 */
public class ShoppingKart {
	int customerId;
	//This Map has mapping from product-id and quantity of products. 
	final Map<Integer, Integer> shoppingKartMap = new HashMap<>();
	final Logger logger = Logger.getLogger(ShoppingKart.class.getName());



	public ShoppingKart(int customerId) {
		super();
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	/**
	 * addProduct method is used when customer is adding products in ShoppingKart 
	 * There is no upper-limit for number of products available.
	 * @param id
	 * @param quantity
	 */
	public void addProduct(final int id, int quantity) {
		final Integer quantityFromMap = shoppingKartMap.get(id);
		if(quantityFromMap !=null)
			quantity = quantityFromMap + quantity;
		logger.info("Adding Product: " + id + ", Quantity:"+ quantity);
		shoppingKartMap.put(id, quantity);
	}

	/**
	 * removeProduct method is used when customer wants to remove products from ShoppingKart.
	 * this method return true if it successfully remove product from ShoppingKart.
	 * @param id
	 * @param quantity
	 * @return
	 * 			true : if it successfully remove product from ShoppingKart.
	 * 			false: if number Of objects needs to be removed from ShoppingKart in lesser than Products available.
	 */
	public boolean removeProduct(final int id, final int quantity) {
		boolean removeOperationResult = true;
		if(shoppingKartMap.get(id)!=null) {
			final Integer quantityAvaialable = shoppingKartMap.get(id);
			final int quantityBalance = quantityAvaialable - quantity;
			if(quantityBalance ==0)
			{
				shoppingKartMap.remove(id);
				logger.info("Product: "+ id + "is removed from ShpooingKart");
			}
			else if(quantityBalance > 0)
			{
				shoppingKartMap.put(id, quantityBalance);
				logger.info("Product's: "+ id + " quantity :" + quantityBalance + " is updated in ShpooingKart");
			}
			else
			{
				logger.warning("Not able to remove " + quantity + "products , cause only " + quantityAvaialable + " products are avialable.");
				removeOperationResult = false;
			}}
		else
		{
			logger.warning("Product is not avaialble in shoppingKart. ProductId:" + id);
			removeOperationResult = false;
		}
		return removeOperationResult;
	}

	/**
	 * @param productMetadata
	 * @return : Total prise of all the products present in ShpooingKart.
	 */
	public double getTotal(final Map<Integer, Product> productMetadata) {
		final Iterator<Integer> shoppingCartItr = shoppingKartMap.keySet().iterator();
		double total = 0;
		while(shoppingCartItr.hasNext())
		{
			int productId = shoppingCartItr.next();
			float productPrise = productMetadata.get(productId).getPrise();
			Integer quantity = shoppingKartMap.get(productId);
			total = total + quantity*productPrise;
		}
		logger.info("ShoppingKart total for Customer: "+ getCustomerId() + " total: " +total);
		return total;
	}

}
