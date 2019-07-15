package com.itbank.mvc08;

public class KoreanCook implements ICook {

	@Override
	public void makeRice() {
		System.out.println("한국밥 만들어요");

	}

	@Override
	public void makeSoup() {
		System.out.println("한국국 만들어요");

	}

	@Override
	public void makeSalad() {
		System.out.println("한국샐러드 만들어요");

	}

	@Override
	public void makeSource() {
		System.out.println("한국소스 만들어요");

	}

}
