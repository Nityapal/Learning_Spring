package com.spring.lifecycle;

public class samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}
	
	//spring bean life-cycle methods
	public void hey() {
		System.out.println("inside init method");
	}
	public void bye() {
		System.out.println("inside destroy method");
	}
}
