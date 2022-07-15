package com.im.util;

import java.util.Scanner;

public class CollectionStack implements Collection {
	
	public int [] add(int [] numbers) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 숫자를 적으세요");
		int num = sc.nextInt();
		int [] numbersStack1 = new int [numbers.length+1];
		numbersStack1[0] = num;
		for(int i=0; i<numbers.length; i++) {
			numbersStack1[i+1] = numbers[i];
		}
		return numbersStack1;
	}
	
	public int [] remove(int [] numbers) {
		int [] numbersStack2 = new int [numbers.length-1];
		for(int i=0; i<numbers.length; i++) {
			numbersStack2[i] = numbers[i+1];
		}
		return numbersStack2;
	}

}
