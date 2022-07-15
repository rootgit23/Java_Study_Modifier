package com.im.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		//싱글톤 (디자인 패턴), MVC2
		
		Iu b = Iu.setIu();
		b.setName("아이유");
		b.setAge(30);
		System.out.println(b.getName());
		System.out.println(b.getAge());
		System.out.println(b);
		
		Iu c = Iu.setIu();
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c);
	}

}
