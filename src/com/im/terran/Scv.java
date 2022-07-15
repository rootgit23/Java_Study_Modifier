package com.im.terran;

import com.im.unit.Unit;

public class Scv extends Unit {
	
	public Scv() {
		super(30);
	}
	//오버라이딩
	public void move() {
		System.out.println("기어다님");
	}
	
	public void attack() {
		System.out.println("공격,.,");
	}
	
	public void work() {
		System.out.println("일하기");
	}

}
