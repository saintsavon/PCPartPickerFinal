package com.PCPartPickerFinal;

import java.util.Arrays;

public class CASEList {
	
	private CASESize[] formFactor;
	
	public CASESize[] getFormFactor() {
		return formFactor;
	}
	
	public void setBrands(CASESize[] formFactor) {
		this.formFactor = formFactor;
	}
	
	public CASEList() {
		super();
	}

	@Override
	public String toString() {
		return "CASEList [brands=" + Arrays.toString(formFactor) + "]";
	}

	public CASEList(CASESize[] formFactor) {
		super();
		this.formFactor = formFactor;
	}
 
}
