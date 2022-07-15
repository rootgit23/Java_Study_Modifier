package com.im.zerg;

import com.im.unit.Unit;

public class Hydra extends Unit {
	
	public Hydra() {
		super(30);
	}
	public void move() {
		System.out.println("이동 !!");
	}
	
	public void attack() {
		System.out.println("공격,.,");
	}
	
}
