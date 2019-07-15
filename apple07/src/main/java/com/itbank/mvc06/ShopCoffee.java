package com.itbank.mvc06;

public abstract class ShopCoffee implements Coffee{

	// 추상메소드가 하나라도 있으면 불완전한 클래스가 됨
	// 고로 ShopCoffee는 추상클래스가 됨
	public abstract void prepare(); // 추상메소드(자식에게 강제성 부여)
	
	@Override
	public void make() {
		System.out.println("가게에서 커피를 만들다.");
	}
	
	@Override
	public void pay() {
		System.out.println("가게에서 포스기로 계산하다.");
	}
}
