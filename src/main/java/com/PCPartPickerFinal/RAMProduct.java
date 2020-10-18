package com.PCPartPickerFinal;

public class RAMProduct {
	
	private String name;
	private int casLatency;
	private int clockSpeed;
	private double cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCasLatency() {
		return casLatency;
	}
	public void setCasLatency(int casLatency) {
		this.casLatency = casLatency;
	}
	public int getClockSpeed() {
		return clockSpeed;
	}
	public void setClockSpeed(int clockSpeed) {
		this.clockSpeed = clockSpeed;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public RAMProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "RAMProduct [name=" + name + ", casLatency=" + casLatency + ", clockSpeed=" + clockSpeed + ", cost="
				+ cost + "]";
	}
	
	public RAMProduct(String name, int casLatency, int clockSpeed, double cost) {
		super();
		this.name = name;
		this.casLatency = casLatency;
		this.clockSpeed = clockSpeed;
		this.cost = cost;
	}
	

}
