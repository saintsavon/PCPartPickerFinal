package com.PCPartPickerFinal;

public class CASEProduct {
	
	private String name;
	private String color;
	private double cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public CASEProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CASEProduct [name=" + name + ", color=" + color + ", cost=" + cost + "]";
	}
	public CASEProduct(String name, String color, double cost) {
		super();
		this.name = name;
		this.color = color;
		this.cost = cost;
	}
	

}
