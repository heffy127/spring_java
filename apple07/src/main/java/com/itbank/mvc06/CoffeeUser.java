package com.itbank.mvc06;

public class CoffeeUser {
	
	public static void main(String[] args) {
//		ShopCoffee shop = new ShopCoffee(); // 추상클래스는 객체생성 불가
		// 추상클래스는 UpCasting의 대상이 된다.
		ShopCoffee shop = new MyShopCoffee();
		shop.make();
		shop.pay();
		shop.prepare();
		
		// 인터페이스는 UpCasting의 대상이 된다.
		// 추상클래스와 인터페이스는 타입으로 쓸 수 있다.
		Coffee shop2 = new MyShopCoffee();
		shop2.make();
		shop2.pay();
//		shop2.prepare(); 자식 인스턴스를 받아줄 수 있지만 본인이 소유하지 않은 메소드는 사용 불가
		
		TruckCoffee truck = new TruckCoffee();
		truck.make();
		truck.pay();
	}
}
