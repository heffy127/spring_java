package com.itbank.mvc05;

public class 나무문 implements Door {

	@Override
	public void open() {
		System.out.println("나무문 열기");

	}

	@Override
	public void close() {
		System.out.println("나무문 닫기");

	}

	@Override
	public void key() {
		System.out.println("나무문 key");

	}

	@Override
	public void made() {
		System.out.println("나무문 made");

	}

}
