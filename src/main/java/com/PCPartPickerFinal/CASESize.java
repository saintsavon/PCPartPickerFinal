package com.PCPartPickerFinal;

import java.util.Arrays;

public class CASESize {
	
	private String formFactor;
	
	private CASEProduct[] products;

	public String getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public CASEProduct[] getProducts() {
		return products;
	}

	public void setProducts(CASEProduct[] products) {
		this.products = products;
	}

	public CASESize() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CASEBrand [brandName=" + formFactor + ", products=" + Arrays.toString(products) + "]";
	}

	public CASESize(String formFactor, CASEProduct[] products) {
		super();
		this.formFactor = formFactor;
		this.products = products;
	}

}
