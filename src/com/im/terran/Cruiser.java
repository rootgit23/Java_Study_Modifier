package com.im.terran;

import com.im.unit.AirUnit;

public class Cruiser extends AirUnit {
	
	public Cruiser() {
		super(30);
	}
	
	//오버라이딩
	public void move() {
		System.out.println("날아다님");
	}

}
