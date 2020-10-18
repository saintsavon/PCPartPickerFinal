package com.PCPartPickerFinal;

import java.util.Arrays;

public class RAMStorage {
	
	private String storageAmount;
	
	private RAMProduct[] products;

	public String getStorageAmount() {
		return storageAmount;
	}

	public void setStorageAmount(String storageAmount) {
		this.storageAmount = storageAmount;
	}

	public RAMProduct[] getProducts() {
		return products;
	}

	public void setProducts(RAMProduct[] products) {
		this.products = products;
	}

	public RAMStorage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RAMStorage [storageAmount=" + storageAmount + ", products=" + Arrays.toString(products) + "]";
	}

	public RAMStorage(String storageAmount, RAMProduct[] products) {
		super();
		this.storageAmount = storageAmount;
		this.products = products;
	}
	

}
