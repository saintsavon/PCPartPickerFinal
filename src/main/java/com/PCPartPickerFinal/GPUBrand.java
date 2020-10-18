package com.PCPartPickerFinal;

import java.util.Arrays;

public class GPUBrand {
	
	private String brandName;
	
	private GPUProduct[] products;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public GPUProduct[] getProducts() {
		return products;
	}

	public void setProducts(GPUProduct[] products) {
		this.products = products;
	}

	public GPUBrand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GPUBrand [brandName=" + brandName + ", products=" + Arrays.toString(products) + "]";
	}

	public GPUBrand(String brandName, GPUProduct[] products) {
		super();
		this.brandName = brandName;
		this.products = products;
	}
	

}
