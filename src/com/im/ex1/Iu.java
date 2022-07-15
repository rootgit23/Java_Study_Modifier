package com.im.ex1;

public class Iu {
	
	private String name;
	private int age;
	//실험
	private String test;
	private static Iu iu=null;
	
	private Iu() {
		
	}
	
	public static Iu setIu() {
		if(Iu.iu == null) {
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
