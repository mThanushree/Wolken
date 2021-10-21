package com.wolk.Planet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="planet_details")
public class PlanetDetails {
	
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String size;
	@Column
	private float distance;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public float getDistance() {
		return distance;
	}
	
	public void setDistance(float distance) {
		this.distance = distance;
	}
	
	@Override
	public String toString() {
		return "butterflydetails [id=" + id + ", name=" + name + ", size=" + size + ", distance=" + distance + "]";
	}
}