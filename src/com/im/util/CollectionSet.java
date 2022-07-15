package com.im.util;

import java.util.Scanner;

public class CollectionSet implements Collection {
	
public int [] add(int [] numbers) {
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	int [] ns2 = new int [numbers.length-1];
	System.out.println("입력할 숫자를 적으세요");
	int num = sc.nextInt();
	for(int i=0; i< numbers.length; i++) {
		if(numbers[i] == num) {
			System.out.println("이미 중복된 숫자여서 넣을수 없습니다");
			flag = !flag;
		}
		else
			continue;
		}
    if(flag) {
		int [] numbersSet1 = new int [numbers.length+1];
		for(int i=0; i<numbers.length; i++) {
				numbersSet1[i] = numbers[i];
			}
		numbersSet1[numbers.length] = num;
		ns2 = numbersSet1;
    }
    return ns2;
}
	
	public int [] remove(int [] numbers) {
		Scanner sc = new Scanner(System.in);
		int [] ns2 = new int [numbers.length-1];
		boolean flag = false;
		int index = 0;
		System.out.println("삭제할 숫자를 입력하세요");
		int num = sc.nextInt();
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == num) {
				flag = !flag;
				break;
			}
		}
		if(flag) {
			int [] numbersSet2 = new int [numbers.length-1];
			for(int i=0; i<numbers.length; i++) {
				if(numbers[i] == num) {
					continue;
				}
				numbersSet2[index] = numbers[i];
				index++;
			}
			ns2 = numbersSet2;
		}
		else
			System.out.println("삭제할 숫자가 없습니다");
		return ns2;
	}

}
