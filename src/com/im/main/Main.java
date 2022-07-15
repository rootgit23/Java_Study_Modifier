package com.im.main;

import java.util.Scanner;

import com.im.himart.Client;
import com.im.himart.Computer;
import com.im.himart.Phone;
import com.im.himart.Tv;

public class Main {

	public static void main(String[] args) {
		Computer com = new Computer("i7","삼성",2000000,200);
		Phone phone = new Phone("애플","7",2500000,250);
		Tv tv = new Tv(100,"LG",3000000,300);
		com.info();
		phone.info();
		tv.info();
		
		Client client = new Client();
		client.buy(tv);
	}

}
