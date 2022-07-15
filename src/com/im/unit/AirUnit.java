package com.im.unit;

public abstract class AirUnit extends Unit {
    
	public AirUnit(int b) {
		super(0);
	}
	
	private int wings;

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}
}
