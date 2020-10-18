package com.PCPartPickerFinal;

import java.util.Arrays;

public class GPUList {
	
	private GPUBrand[] brands;

	public GPUBrand[] getBrands() {
		return brands;
	}

	public void setBrands(GPUBrand[] brands) {
		this.brands = brands;
	}

	public GPUList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GPUList [brands=" + Arrays.toString(brands) + "]";
	}

	public GPUList(GPUBrand[] brands) {
		super();
		this.brands = brands;
	}
	

}
