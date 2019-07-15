package com.itbank.mvc06;

public class AppleTv implements Tv {
	@Override
	public void powerOn() {
		System.out.println("애플 TV를 켜다.");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("애플 TV볼륨 Up");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("애플 TV볼륨 Down");
	}
}
