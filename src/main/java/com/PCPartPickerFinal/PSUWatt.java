package com.PCPartPickerFinal;

import java.util.Arrays;

public class PSUWatt {
	
	private String wattage;
	
	private PSUProduct[] products;

	public String getWattage() {
		return wattage;
	}

	public void setWattage(String wattage) {
		this.wattage = wattage;
	}

	public PSUProduct[] getProducts() {
		return products;
	}

	public void setProducts(PSUProduct[] products) {
		this.products = products;
	}

	public PSUWatt() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PSUWatt [wattage=" + wattage + ", products=" + Arrays.toString(products) + "]";
	}

	public PSUWatt(String wattage, PSUProduct[] products) {
		super();
		this.wattage = wattage;
		this.products = products;
	}
	

}
