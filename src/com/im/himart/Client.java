package com.im.himart;

public class Client {

	private int money;
	private int point;
	
	public Client() {
		this.money = 30000000;
		this.setPoint(10);
	}
	
	public void buy(int price, int point) {
		this.money = this.money - price;
		this.point = this.point + point;
		System.out.print("현재 남은 금액 : " + this.money);
		System.out.println(" 현재 포인트 : " + this.point);
	}
	
	public void buy(Tv tv) {
		this.money = this.money - tv.getPrice();
		this.point = this.point + tv.getPoint();
		System.out.print("현재 남은 금액 : " + this.money);
		System.out.println(" 현재 포인트 : " + this.point);
	}
	
	public void buy(Computer com) {
		this.money = this.money - com.getPrice();
		this.point = this.point + com.getPoint();
		System.out.print("현재 남은 금액 : " + this.money);
		System.out.println(" 현재 포인트 : " + this.point);
	}
	
	public void buy(Phone phone) {
		this.money = this.money - phone.getPrice();
		this.point = this.point + phone.getPoint();
		System.out.print("현재 남은 금액 : " + this.money);
		System.out.println(" 현재 포인트 : " + this.point);
	}
	

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
