package com.im.animal;

public class Zoo {
	
	//클래스변수
	public static String title = "사파리";
	
	public final int PRICE=50000;
	
	public int price=50000;
	
	//클래스메서드
	public static void info() {
		System.out.println("Static Method");
		System.out.println(Zoo.title);
		//System.out.println(price);
		//getPrice();
	}
	
	public void getPrice() {
		System.out.println(price);
		System.out.println(Zoo.title);
		Zoo.info();
	}
	
	Zoo zoo = new Zoo();
	//zoo.price=10000;

}
