package com.itbank.mvc06;

public class KoreanFood implements Cook{

	@Override
	public void eat() {
		System.out.println("한국음식 먹어요");
		
	}

	@Override
	public void pay() {
		System.out.println("한국음식 결제해요");
		
	}

}
