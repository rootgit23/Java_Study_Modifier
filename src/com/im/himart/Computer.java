package com.im.himart;

public class Computer extends Product {
	
	private String cpu;
	
	public Computer(String cpu, String brand, int price, int point) {
		this.cpu = cpu;
		this.setBrand(brand);
		this.setPrice(price);
		this.setPoint(point);
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void info()
	{
		System.out.print(this.cpu);
		System.out.print(this.getBrand());
		System.out.print(this.getPrice());
		System.out.println(this.getPoint());
	}

}
