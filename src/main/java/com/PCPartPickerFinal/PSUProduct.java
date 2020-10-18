package com.PCPartPickerFinal;

public class PSUProduct {
	
	private String name;
	private String modularity;
	private String rating;
	private double cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModularity() {
		return modularity;
	}
	public void setModularity(String modularity) {
		this.modularity = modularity;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public PSUProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "PSUProduct [name=" + name + ", modularity=" + modularity + ", rating=" + rating + ", cost=" + cost
				+ "]";
	}
	
	public PSUProduct(String name, String modularity, String rating, double cost) {
		super();
		this.name = name;
		this.modularity = modularity;
		this.rating = rating;
		this.cost = cost;
	}
	

}
