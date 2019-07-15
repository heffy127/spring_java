package com.itbank.mvc06;

public class ChainShopCoffee extends ShopCoffee{

	@Override
	public void prepare() {
		System.out.println("체인점에서 물건을 산다");
	}
	
}
