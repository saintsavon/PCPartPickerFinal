package com.PCPartPickerFinal;

import java.util.Arrays;

public class PSUList {
	
	private PSUWatt[] wattage;

	public PSUWatt[] getWattage() {
		return wattage;
	}

	public void setWattage(PSUWatt[] wattage) {
		this.wattage = wattage;
	}

	public PSUList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PSUList [wattage=" + Arrays.toString(wattage) + "]";
	}

	public PSUList(PSUWatt[] wattage) {
		super();
		this.wattage = wattage;
	}
	

}
