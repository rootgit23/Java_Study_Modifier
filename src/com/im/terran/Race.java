package com.im.terran;

import com.im.unit.AirUnit;

public class Race extends AirUnit {
	
	public Race() {
		super(30);
	}
	
	//오버라이딩
	public void move() {
		System.out.println("날아다님");
	}
}
