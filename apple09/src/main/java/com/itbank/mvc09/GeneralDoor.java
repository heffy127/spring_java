package com.itbank.mvc09;

public class GeneralDoor implements Door{

	@Override
	public void doorOpen() {
		System.out.println("문이 그냥 열려요..");
		
	}
	@Override
	public void doorClose() {
		System.out.println("문이 그냥 닫혀요..");
		
	}

}
