package com.im.util;

import java.util.Scanner;

public class CollectionSet implements Collection {
	
public int [] add(int [] numbers) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("입력할 숫자를 적으세요");
		int num = sc.nextInt();
		boolean flag = true;
		for(int i=0; i< numbers.length; i++) {
			if(numbers[i] == num) {
				System.out.println("이미 중복된 숫자여서 넣을수 없습니다");
				continue;
			}
		}
	}
	if(flag) {
		int [] numbersSet1 = new int [numbers.length+1];
		for(int i=0; i<numbers.length; i++) {
			numbersSet1[i] = numbers[i];
		}
		numbersSet1[numbers.length] = num;
	}
	return numbersSet1;
}
	
	public int [] remove(int [] numbers) {
		
	}

}
