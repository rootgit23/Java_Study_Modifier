package com.im.main;

import com.im.util.CollectionQueue;
import com.im.util.CollectionSet;
import com.im.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		
		//1.com.im.util 패키지에 클래스명은 CollectionStack 생성
			//add를 호출하면 새로운 입력받은 숫자를 추가 무조권 0번째 인덱스에
			//remove 호출하면 0번 인덱스 삭제
		//2.CollectionQueue 생성
			//add를 호출하면 새로운 입력받은 숫자를 추가 무조권 0번째 인덱스에
			//remove 호출하면 마지막 인덱스 삭제
		//3.CollectionSet 생성
			//add 입력한 새로운 숫자 추가를 맨 마지막 인덱스에 단 중복되지 않는 숫자만 가능
			//remove 삭제할 숫자를 입력받아서 일치하는 숫자 삭제
		//전부 배열 리턴
		int [] num = {1,2,3};
		int [] a;
		CollectionStack cs = new CollectionStack();
		CollectionQueue cq = new CollectionQueue();
		CollectionSet css = new CollectionSet();
		a = cs.add(num);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);	
		}
		System.out.println("---------------------");
		a = cs.remove(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);		
		}
		System.out.println("---------------------");
		a = cq.add(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);	
		}
		System.out.println("---------------------");
		a = cq.remove(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);		
		}
		System.out.println("---------------------");
		a = css.add(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);	
		}
		System.out.println("---------------------");
		a = css.remove(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("---------------------");
	}

}
