package com.wolk.cap.DI;

public class Topi {
	private String name;
	private int types;
	private String brand;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTypes(int types) {
		this.types = types;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", types=" + types + ", brand=" + brand + "]";
	}
	
	
}