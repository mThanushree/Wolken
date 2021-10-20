package com.wolk.butterfly.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "butterfly_details")
public class ButterflyDetails {
	
	@Id
	@Column(name = "b_type")
	private String type;
	@Column(name = "b_colour")
	private String color;
	@Column(name = "b_name")
	private String name;
	@Column(name = "no_of_types")
	private int noOfTypes;	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfTypes() {
		return noOfTypes;
	}
	public void setNoOfTypes(int noOfTypes) {
		this.noOfTypes = noOfTypes;
	}
	@Override
	public String toString() {
		return "ButterflyDetails [type=" + type + ", color=" + color + ", name=" + name + ", noOfTypes=" + noOfTypes
				+ "]";
	}
	
	
	
	
	
	
	

}
