package com.im.terran;

import com.im.unit.Attacker;
import com.im.unit.Unit;

public class Marine extends Unit implements Attacker{
	
	private String weapon;
	
	public Marine() {
		super(30);
		System.out.println("Marine 생성자");
	}
	
	public void attack() {
		this.shoot();
	}
	
	private void shoot() {
		System.out.println("우다다다");
	}
	
	//이것도 오버라이딩
	public void info() {
		System.out.println("Marine Info");
	}
	
	//오버라이딩
	public void move() {
		System.out.println("뛰어다님");
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

}
