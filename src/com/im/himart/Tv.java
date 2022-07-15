package com.im.himart;

public class Tv extends Product {
	
	private int size;
	
	public Tv(int size, String brand, int price, int point) {
		this.size = size;
		this.setBrand(brand);
		this.setPrice(price);
		this.setPoint(point);
	}
	
	public void info() {
		System.out.print(this.size);
		System.out.print(this.getBrand());
		System.out.print(this.getPrice());
		System.out.println(this.getPoint());
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
