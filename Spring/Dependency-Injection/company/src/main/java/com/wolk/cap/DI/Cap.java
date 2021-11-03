package com.wolk.cap.DI;

public class Cap {
	private String name;
	private int price;
	Topi topi;
	
	public Cap() {
		System.out.println("Default Constructor");
	}
	public Cap(String name,int price,Topi topi) {
		this.name=name;
		this.price=price;
		this.topi=topi;
	}
	
	public void print() {
		System.out.println("name:"+name);
		System.out.println("price:"+ price);
		System.out.println("details:"+topi);
	}
}
