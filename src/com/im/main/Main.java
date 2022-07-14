package com.im.main;

import com.im.animal.Cat;
import com.im.animal.Human;
import com.im.animal.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cat cat = new Cat();
		//cat.sound();
		//cat.age=5;
		Human human = new Human();
		//human.age = 10;
		human.setAge(40);
		human.info();
		
		System.out.println(Zoo.title);
		Zoo.info();
	}

}
