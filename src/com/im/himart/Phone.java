package com.im.himart;

public class Phone extends Product {
	
	private String company;
	
	public Phone(String company, String brand, int price, int point) {
		this.company = company;
		this.setBrand(brand);
		this.setPrice(price);
		this.setPoint(point);
	}
	
	public void info() {
		System.out.print(this.company);
		System.out.print(this.getBrand());
		System.out.print(this.getPrice());
		System.out.println(this.getPoint());
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
