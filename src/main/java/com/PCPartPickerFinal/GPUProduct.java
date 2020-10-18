package com.PCPartPickerFinal;

public class GPUProduct {
	
	private String name;
	private int powerConsumption;
	private double cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public GPUProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "GPUProduct [name=" + name + ", powerConsumption=" + powerConsumption + ", cost=" + cost + "]";
	}
	
	public GPUProduct(String name, int powerConsumption, double cost) {
		super();
		this.name = name;
		this.powerConsumption = powerConsumption;
		this.cost = cost;
	}
	

}
