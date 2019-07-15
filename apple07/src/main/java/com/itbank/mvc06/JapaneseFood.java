package com.itbank.mvc06;

public class JapaneseFood implements Cook{

	@Override
	public void eat() {
		System.out.println("일본음식 먹어요");
		
	}

	@Override
	public void pay() {
		System.out.println("일본음식 결제해요");
		
	}

}
