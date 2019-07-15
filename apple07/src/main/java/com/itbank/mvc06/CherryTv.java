package com.itbank.mvc06;

public class CherryTv implements Tv {

	@Override
	public void powerOn() {
		System.out.println("체리티비 전원 켬");
	}

	@Override
	public void volumeUp() {
		System.out.println("체리티비 볼륨 올림");
	}

	@Override
	public void volumeDown() {
		System.out.println("체리티비 볼륨 낮춤");
	}

}
