package com.im.main;

import com.im.terran.Marine;
import com.im.zerg.Hydra;

public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		m1.setHp(30);
		Hydra h1 = new Hydra();
		h1.attack();
		m1.info();
		m1.move();
		
	}

}
