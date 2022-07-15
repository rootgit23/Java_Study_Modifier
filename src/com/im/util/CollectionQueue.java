package com.im.util;

import java.util.Scanner;

public class CollectionQueue implements Collection {
	
public int [] add(int [] numbers) {
	Scanner sc = new Scanner(System.in);
	System.out.println("입력할 숫자를 적으세요");
	int num = sc.nextInt();
	int [] numbersQueue1 = new int [numbers.length+1];
	numbersQueue1[0] = num;
	for(int i=0; i<numbers.length; i++) {
		numbersQueue1[i+1] = numbers[i];
	}
	return numbersQueue1;
}
	
	public int [] remove(int [] numbers) {
		int [] numbersQueue2 = new int [numbers.length-1];
		for(int i=0; i<numbersQueue2.length; i++) {
			numbersQueue2[i] = numbers[i];
		}
		return numbersQueue2;
		
	}

}
