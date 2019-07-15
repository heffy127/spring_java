package com.itbank.mvc06;

public class CookUser {
	public static void main(String[] args) {
		Cook kor = new KoreanFood();
		kor.eat();
		kor.pay();
		
		Cook jap = new JapaneseFood();
		jap.eat();
		jap.pay();
	}
}
