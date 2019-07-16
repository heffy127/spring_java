package com.itbank.mvc09;

public class SkyDoor implements Door{

	@Override
	public void doorOpen() {
		System.out.println("문이 하늘로 열려요..");
		
	}
	@Override
	public void doorClose() {
		System.out.println("문이 하늘에서부터 닫혀요..");
		
	}

}
