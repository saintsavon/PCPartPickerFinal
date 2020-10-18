package com.PCPartPickerFinal;

import java.util.Arrays;

public class CASEBrand {
	
	private String brandName;
	
	private CASEProduct[] products;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public CASEProduct[] getProducts() {
		return products;
	}

	public void setProducts(CASEProduct[] products) {
		this.products = products;
	}

	public CASEBrand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CASEBrand [brandName=" + brandName + ", products=" + Arrays.toString(products) + "]";
	}

	public CASEBrand(String brandName, CASEProduct[] products) {
		super();
		this.brandName = brandName;
		this.products = products;
	}

}
