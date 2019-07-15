package com.itbank.mvc06;

public class BananaTv implements Tv {

	@Override
	public void powerOn() {
		System.out.println("바나나티비 전원 켬");
	}

	@Override
	public void volumeUp() {
		System.out.println("바나나티비 볼륨 올림");
	}

	@Override
	public void volumeDown() {
		System.out.println("바나나티비 볼륨 낮춤");
	}

}
