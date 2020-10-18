package com.PCPartPickerFinal;

import java.util.Arrays;

public class RAMList {
	
	private RAMStorage[] storage;

	public RAMStorage[] getStorage() {
		return storage;
	}

	public void setStorage(RAMStorage[] storage) {
		this.storage = storage;
	}

	public RAMList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RAMList [storage=" + Arrays.toString(storage) + "]";
	}

	public RAMList(RAMStorage[] storage) {
		super();
		this.storage = storage;
	}

}
