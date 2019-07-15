package com.itbank.mvc06;

public class TvUser3 {
	public static void main(String[] args) {
		FactoryBean factory = new FactoryBean();
		// runAs -> RunConfiguration -> argument에서 String값 입력
		Tv tv = (Tv)factory.getBean(args[0]); // Object로 넘겨받았기에 DownCasting 필요
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
	}
}
