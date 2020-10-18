package com.PCPartPickerFinal;

import java.util.Arrays;

public class CASEList {
	
	private CASEBrand[] brands;
	
	public CASEBrand[] getBrands() {
		return brands;
	}
	
	public void setBrands(CASEBrand[] brands) {
		this.brands = brands;
	}
	
	public CASEList() {
		super();
	}

	@Override
	public String toString() {
		return "CASEList [brands=" + Arrays.toString(brands) + "]";
	}

	public CASEList(CASEBrand[] brands) {
		super();
		this.brands = brands;
	}
 
}
