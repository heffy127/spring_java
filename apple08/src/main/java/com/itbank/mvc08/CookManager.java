package com.itbank.mvc08;

public class CookManager{
	ICook i = null;
	public CookManager() {}
	
	public CookManager(ICook cook) { // 생성자 주입(의존성)
		i = cook;
	}
	
	public void orderRice() {
		i.makeRice();
	}
	
	public void orderSoup() {
		i.makeSoup();
	}
}
