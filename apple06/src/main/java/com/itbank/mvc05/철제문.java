package com.itbank.mvc05;

public class 철제문 implements Door {

	@Override
	public void open() {
		System.out.println("철제문 열기");

	}

	@Override
	public void close() {
		System.out.println("철제문 닫기");

	}

	@Override
	public void key() {
		System.out.println("철제문 key");

	}

	@Override
	public void made() {
		System.out.println("철제문 made");

	}

}
